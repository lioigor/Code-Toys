<html><head><title>Demonstration work with "Sport" database</title></head> <body>
<hl>Demonstration work with "Sport" database</hl> <br>

...
 <meta charset="utf-8">
<br>
3. Вывести список спортсменов, участвующих более чем в 8 соревнованиях в году.<br><br>
<font color="red">SELECT s.FirstName, s.SecondName, c.Name AS Country<br>
FROM sportsman s<br>
INNER JOIN country c ON s.CountryID = c.ID<br>
WHERE s.ID<br>
IN (SELECT SportsmanID<br>
FROM result<br>
WHERE CompetitionID<br>
IN (
SELECT ID<br>
FROM сompetition<br>
WHERE YEAR( Data )
IN (
SELECT DISTINCT YEAR( Data )<br>
FROM сompetition
))<br>
GROUP BY SportsmanID<br>
HAVING COUNT( * ) >8);<br>
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
$result = mysql_query ("SELECT s.FirstName, s.SecondName, c.Name AS Country
FROM sportsman s
INNER JOIN country c ON s.CountryID = c.ID
WHERE s.ID
IN (SELECT SportsmanID
FROM result
WHERE CompetitionID
IN (
SELECT ID
FROM сompetition
WHERE YEAR( Data )
IN (
SELECT DISTINCT YEAR( Data )
FROM сompetition
))
GROUP BY SportsmanID
HAVING COUNT( * ) >8);", $db);

echo '<table>
      <tr>
        <td style="width:40px;" align="center"> <strong>FirstName</strong></td>
        <td style="width:90px;" align="center"> <strong>SecondName</strong></td>
        <td style="width:90px;" align="center"> <strong>Country</strong></td>
      </tr>';
while ($myrow = mysql_fetch_assoc ($result))
 {
  echo '
        <tr>
        <td style="width:40px;" align="center">'.$myrow['FirstName'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['SecondName'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['Country'].'</td>
        </tr>';
 }
 echo '</table>'; 
?>
<br>
<input type="button" value = "Back" onclick="history.back()" style="width:140px; height:40px;">

</body> </html>


