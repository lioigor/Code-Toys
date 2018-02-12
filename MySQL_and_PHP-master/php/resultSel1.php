<html><head><title>Demonstration work with "Sport" database</title></head> <body>
<hl>Demonstration work with "Sport" database</hl> <br>

...
 <meta charset="utf-8">
<br>
1. Вывести таблицу распределения мест в соревновании 'открытый чемпионат' в городе 'Васюки' по 'шахматам' в 2015 г.<br><br>
<font color="red">SELECT r.Place, s.FirstName, s.SecondName, c.Name AS country<br>
FROM result r<br>
INNER JOIN sportsman s ON r.SportsmanID = s.ID<br>
INNER JOIN country c ON s.CountryID = c.ID<br>
WHERE CompetitionID = (SELECT ID<br>
FROM сompetition<br>
WHERE CityID = (
SELECT ID
FROM City<br>
WHERE Name = 'Vasyuki') AND YEAR(сompetition.Data) = 2015 <br>
AND SportID = 1)<br>
ORDER BY r.Place;<br>
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
$result = mysql_query ("SELECT r.Place, s.FirstName, s.SecondName, c.Name AS country
FROM result r
INNER JOIN sportsman s ON r.SportsmanID = s.ID
INNER JOIN country c ON s.CountryID = c.ID
WHERE CompetitionID = (SELECT ID
FROM сompetition
WHERE CityID = (
SELECT ID
FROM City
WHERE Name = 'Vasyuki') AND YEAR(сompetition.Data) = 2015 
AND SportID = 1)
ORDER BY r.Place;", $db);

echo '<table>
      <tr>
        <td style="width:50px;" align="center"><strong>Place</strong></td>
        <td style="width:40px;" align="center"> <strong>FirstName</strong></td>
        <td style="width:90px;" align="center"> <strong>SecondName</strong></td>
        <td style="width:90px;" align="center"> <strong>Country</strong></td>
      </tr>';
while ($myrow = mysql_fetch_assoc ($result))
 {
  echo '
        <tr>
        <td style="width:50px;" align="center">'.$myrow['Place'].'</td>
        <td style="width:40px;" align="center">'.$myrow['FirstName'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['SecondName'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['country'].'</td>
        </tr>';
 }
 echo '</table>'; 
?>
<br>
<input type="button" value = "Back" onclick="history.back()" style="width:140px; height:40px;">

</body> </html>


