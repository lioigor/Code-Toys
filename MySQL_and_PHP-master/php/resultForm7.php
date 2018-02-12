<html><head><title>Demonstration work with "Sport" database</title></head> <body>
<hl>Demonstration work with "Sport" database</hl> <br>

...
<br>

<font color="red">SELECT * FROM world_record ORDER BY ID;</font>
<br>
<br>
<?php

$db = mysql_connect ("localhost", "igor", "2204");
mysql_select_db ("sport", $db);
mysql_query ('SET NAMES utf-8');
mysql_query ("set character_set_client='utf8'");
mysql_query ("set character_set_results='utf8'");
mysql_query ("set collation_connection='utf8_general_ci'");
$result = mysql_query ("SELECT * FROM world_record ORDER BY ID;", $db);

echo '<table>
      <tr>
        <td style="width:50px;" align="center"><strong>ID</strong></td>
        <td style="width:40px;" align="center"> <strong>SportID</strong></td>
        <td style="width:90px;" align="center"> <strong>value</strong></td>
      </tr>';
while ($myrow = mysql_fetch_assoc ($result))
 {
  echo '
        <tr>
        <td style="width:50px;" align="center">'.$myrow['ID'].'</td>
        <td style="width:40px;" align="center">'.$myrow['sportID'].'</td>
        <td style="width:90px; padding-left:25px;">'.$myrow['value'].'</td>
        </tr>';
 }
 echo '</table>'; 
?>
<br>
<input type="button" value = "Back" onclick="history.back()" style="width:140px; height:40px;">

</body> </html>


