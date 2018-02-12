<html><head><title>Demonstration work with "Sport" database</title></head> <body>
<hl>Demonstration work with "Sport" database</hl> <br>

...
 <meta charset="utf-8">
<br>
2. Определить спортсменов, которые имеют как олимпийский, так и мировой рекорд.<br><br>
<font color="red">SELECT s.FirstName, s.SecondName, c.Name AS Country<br>
FROM sportsman s<br>
INNER JOIN country c ON s.CountryID = c.ID<br>
WHERE s.ID<br>
IN (SELECT r.SportsmanID<br>
FROM result r<br>
INNER JOIN сompetition com ON r.CompetitionID = com.ID<br>
WHERE Result_value = (<br>
SELECT value<br>
FROM world_record<br>
WHERE SportID = com.SportID )<br>
AND Result_value >= (<br>
SELECT value<br>
FROM olympic_record<br>
WHERE SportID = com.SportID ))<br>
ORDER BY s.SecondName;<br>
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
IN (SELECT r.SportsmanID
FROM result r
INNER JOIN сompetition com ON r.CompetitionID = com.ID
WHERE Result_value = (
SELECT value
FROM world_record
WHERE SportID = com.SportID )
AND Result_value >= (
SELECT value
FROM olympic_record
WHERE SportID = com.SportID ))
ORDER BY s.SecondName;", $db);

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


