<html><head><title>Demonstration work with "Sport" database</title></head> <body>
<hl>Demonstration work with "Sport" database</hl> <br>

...
 <meta charset="utf-8">
<br>
4. Определить наилучший показатель спортсмена 'Караваев' в виде спорта 'тараканьи<br>
бега' и разницу с мировым и олимпийским рекордами.<br><br>
<font color="red">SELECT s.FirstName, s.SecondName, c.Name AS Country, sp.Name AS sport, MAX(rv.Result_value) AS <br>Best_result, sp.Measurement_unit AS Measurement_unit, (wr.value - MAX(rv.Result_value)) AS world_difference,<br> (ol.value - MAX(rv.Result_value)) AS olympic_difference<br>
FROM sportsman s<br>
INNER JOIN country c ON s.CountryID = c.ID<br>
INNER JOIN result rv ON s.ID = rv.SportsmanID<br>
INNER JOIN сompetition com ON rv.CompetitionID = com.ID<br>
INNER JOIN sport sp ON com.SportID = sp.ID<br>
INNER JOIN world_record wr ON com.SportID = wr.ID<br>
INNER JOIN olympic_record ol ON com.SportID = ol.ID<br>
WHERE s.SecondName LIKE 'Karavaev'<br>
AND sp.Name LIKE 'Cockroach races';
<br>
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
$result = mysql_query ("SELECT s.FirstName, s.SecondName, c.Name AS Country, sp.Name AS sport, MAX(rv.Result_value) AS Best_result, sp.Measurement_unit AS Measurement_unit, (wr.value - MAX(rv.Result_value)) AS world_difference, (ol.value - MAX(rv.Result_value)) AS olympic_difference
FROM sportsman s
INNER JOIN country c ON s.CountryID = c.ID
INNER JOIN result rv ON s.ID = rv.SportsmanID
INNER JOIN сompetition com ON rv.CompetitionID = com.ID
INNER JOIN sport sp ON com.SportID = sp.ID
INNER JOIN world_record wr ON com.SportID = wr.ID
INNER JOIN olympic_record ol ON com.SportID = ol.ID
WHERE s.SecondName LIKE 'Karavaev'
AND sp.Name LIKE 'Cockroach races';", $db);

echo '<table>
      <tr>
        <td style="width:40px;" align="center"> <strong>FirstName</strong></td>
        <td style="width:90px;" align="center"> <strong>SecondName</strong></td>
        <td style="width:90px;" align="center"> <strong>Country</strong></td>
        <td style="width:90px;" align="center"> <strong>Sport</strong></td>
        <td style="width:90px;" align="center"> <strong>Best result</strong></td>
        <td style="width:90px;" align="center"> <strong>Measurement unit</strong></td>
        <td style="width:90px;" align="center"> <strong>world difference</strong></td>
        <td style="width:90px;" align="center"> <strong>olympic difference</strong></td>
      </tr>';
while ($myrow = mysql_fetch_assoc ($result))
 {
  echo '
        <tr>
        <td style="width:40px;" align="center">'.$myrow['FirstName'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['SecondName'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['Country'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['sport'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['Best_result'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['Measurement_unit'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['world_difference'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['olympic_difference'].'</td>
        </tr>';
 }
 echo '</table>'; 
?>
<br>
<input type="button" value = "Back" onclick="history.back()" style="width:140px; height:40px;">

</body> </html>


