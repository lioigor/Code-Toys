<html><head><title>Demonstration work with "Sport" database</title></head> <body>
<hl>Demonstration work with "Sport" database</hl> <br>

...
 <meta charset="utf-8">
<br>
2. Вид спорта, количество соревнований за год, количество попаданий спортсменов из
'Украины' в призеры.<br><br>
<font color="red">CREATE VIEW UkrainesTop AS<br>
(SELECT sp.NAME AS sport, YEAR( com.Data ) AS year_of, (SELECT COUNT(*)<br>
FROM сompetition WHERE SportID = com.SportID AND YEAR(Data) = YEAR(com.Data) ) AS NumberOfEventsYear, <br>
COUNT(DISTINCT com.ID) AS Ukraines_count<br>
FROM result res<br>
LEFT JOIN сompetition com ON res.CompetitionID = com.ID<br>
LEFT JOIN sport sp ON  com.SportID = sp.ID<br>
LEFT JOIN sportsman spm ON res.SportsmanID = spm.ID<br>
LEFT JOIN country c ON spm.CountryID = c.ID<br>
WHERE com.ID
IN (
SELECT ID<br>
FROM сompetition
WHERE YEAR( Data )
IN (
SELECT DISTINCT YEAR( Data )<br>
FROM сompetition))<br>
AND res.Place IN (1, 2, 3)<br>
AND c.Name LIKE 'Ukraine'<br>
GROUP BY sport, year_of, NumberOfEventsYear);
<br>
<br>
</font>
<br>
<br>
<?php

$db = mysql_connect ("localhost", "igor", "2204");
mysql_select_db ("sport", $db);
mysql_query ('SET NAMES utf-8');
mysql_query ("set character_set_client='utf8'");
mysql_query ("set character_set_results='utf8'");
mysql_query ("set collation_connection='utf8_general_ci'");
$result = mysql_query ("SELECT * FROM ukrainestop ", $db);

echo '<table>
      <tr>
        <td style="width:50px;" align="center"><strong>sport</strong></td>
        <td style="width:40px;" align="center"> <strong>year of</strong></td>
        <td style="width:90px;" align="center"> <strong>number of events in year</strong></td>
        <td style="width:90px;" align="center"> <strong>Ukraines count</strong></td>
      </tr>';
while ($myrow = mysql_fetch_assoc ($result))
 {
  echo '
        <tr>
        <td style="width:50px;" align="center">'.$myrow['sport'].'</td>
        <td style="width:40px;" align="center">'.$myrow['year_of'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['NumberOfEventsYear'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['Ukraines_count'].'</td>
        </tr>';
 }
 echo '</table>'; 
?>
<br>
<input type="button" value = "Back" onclick="history.back()" style="width:140px; height:40px;">

</body> </html>


