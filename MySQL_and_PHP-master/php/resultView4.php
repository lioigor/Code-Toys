<html><head><title>Demonstration work with "Sport" database</title></head> <body>
<hl>Demonstration work with "Sport" database</hl> <br>

...
 <meta charset="utf-8">
<br>
4. Вид спорта, рекорды, установленные в этом виде спорта за последние пять лет,<br> место соревнований, на которых установлены рекорды.<br><br>
<font color="red">CREATE VIEW Records_5years AS<br>
(SELECT sp.NAME AS sport, wr.value AS world_record, ct.Name AS City<br>
FROM result res<br>
LEFT JOIN сompetition com ON res.CompetitionID = com.ID<br>
LEFT JOIN sport sp ON  com.SportID = sp.ID<br>
LEFT JOIN city ct ON com.CityID = ct.ID<br>
LEFT JOIN world_record wr ON sp.ID = wr.SportID<br>
WHERE res.Result_value = wr.value<br>
AND YEAR(com.Data) IN (<br>
(SELECT DISTINCT MAX(YEAR( Data ))<br>
FROM сompetition), (SELECT DISTINCT MAX(YEAR( Data ) - 1)<br>
FROM сompetition), (SELECT DISTINCT MAX(YEAR( Data ) - 2)<br>
FROM сompetition), (SELECT DISTINCT MAX(YEAR( Data ) - 3)<br>
FROM сompetition), (SELECT DISTINCT MAX(YEAR( Data ) - 4)<br>
FROM сompetition)));
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
$result = mysql_query ("SELECT * FROM records_5years ", $db);

echo '<table>
      <tr>
        <td style="width:50px;" align="center"><strong>sport</strong></td>
        <td style="width:40px;" align="center"> <strong>world record</strong></td>
        <td style="width:90px;" align="center"> <strong>city</strong></td>
      </tr>';
while ($myrow = mysql_fetch_assoc ($result))
 {
  echo '
        <tr>
        <td style="width:50px;" align="center">'.$myrow['sport'].'</td>
        <td style="width:40px;" align="center">'.$myrow['world_record'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['City'].'</td>
        </tr>';
 }
 echo '</table>'; 
?>
<br>
<input type="button" value = "Back" onclick="history.back()" style="width:140px; height:40px;">

</body> </html>


