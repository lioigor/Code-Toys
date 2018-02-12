<html><head><title>Demonstration work with "Sport" database</title></head> <body>
<hl>Demonstration work with "Sport" database</hl> <br>

...
 <meta charset="utf-8">
<br>
3. Страна, количество спортсменов этой страны, общее количество побед спортсменов<br>
этой страны за год на соревнованиях, в названиях которых входит слово ' race'.<br><br>
<font color="red">CREATE VIEW Country_wins_race AS<br>
(SELECT c.Name AS country, (SELECT COUNT(*) FROM sportsman<br>
WHERE CountryID = (SELECT ID FROM country WHERE Name = c.Name)) AS count_sportsmans, YEAR( com.Data ) AS year_of, (<br>SELECT COUNT(*)<br>
FROM result WHERE CompetitionID = com.ID AND SportsmanID = <br>
(SELECT ID FROM Sportsman WHERE CountryID = c.ID)) AS total_wins <br>
FROM result res<br>
LEFT JOIN сompetition com ON res.CompetitionID = com.ID<br>
LEFT JOIN sportsman spm ON res.SportsmanID = spm.ID<br>
LEFT JOIN country c ON spm.CountryID = c.ID<br>
WHERE com.Name LIKE '%race%' AND res.Place = 1<br>
GROUP BY country, count_sportsmans, year_of<br>
ORDER BY year_of);
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
$result = mysql_query ("SELECT * FROM country_wins_race ", $db);

echo '<table>
      <tr>
        <td style="width:50px;" align="center"><strong>country</strong></td>
        <td style="width:40px;" align="center"> <strong>count sportsmans</strong></td>
        <td style="width:90px;" align="center"> <strong>year of</strong></td>
        <td style="width:90px;" align="center"> <strong>total wins</strong></td>
      </tr>';
while ($myrow = mysql_fetch_assoc ($result))
 {
  echo '
        <tr>
        <td style="width:50px;" align="center">'.$myrow['country'].'</td>
        <td style="width:40px;" align="center">'.$myrow['count_sportsmans'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['year_of'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['total_wins'].'</td>
        </tr>';
 }
 echo '</table>'; 
?>
<br>
<input type="button" value = "Back" onclick="history.back()" style="width:140px; height:40px;">

</body> </html>


