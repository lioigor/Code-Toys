<html><head><title>Demonstration work with "Sport" database</title></head> <body>
<hl>Demonstration work with "Sport" database</hl> <br>

...
 <meta charset="utf-8">
<br>
1. Вид спорта, соревнование, место, дата, мировой рекорд, который был установлен.<br><br>
<font color="red">CREATE VIEW WorldRecordSet AS<br>
(SELECT sp.NAME AS sport, com.Name AS сompetition, ct.Name AS location, com.Data AS Data, wr.value AS world_record<br>
FROM result res<br>
LEFT JOIN сompetition com ON res.CompetitionID = com.ID<br>
LEFT JOIN sport sp ON  com.SportID = sp.ID<br>
LEFT JOIN city ct ON com.CityID = ct.ID<br>
LEFT JOIN world_record wr ON sp.ID = wr.SportID<br>
WHERE res.Result_value = wr.value);<br>
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
$result = mysql_query ("SELECT * FROM worldrecordset ", $db);

echo '<table>
      <tr>
        <td style="width:50px;" align="center"><strong>sport</strong></td>
        <td style="width:40px;" align="center"> <strong>competition</strong></td>
        <td style="width:90px;" align="center"> <strong>location</strong></td>
        <td style="width:90px;" align="center"> <strong>Data</strong></td>
        <td style="width:90px;" align="center"> <strong>world record</strong></td>
      </tr>';
while ($myrow = mysql_fetch_assoc ($result))
 {
  echo '
        <tr>
        <td style="width:50px;" align="center">'.$myrow['sport'].'</td>
        <td style="width:40px;" align="center">'.$myrow['сompetition'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['location'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['Data'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['world_record'].'</td>
        </tr>';
 }
 echo '</table>'; 
?>
<br>
<input type="button" value = "Back" onclick="history.back()" style="width:140px; height:40px;">

</body> </html>


