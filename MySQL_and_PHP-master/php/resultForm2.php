<html><head><title>Demonstration work with "Sport" database</title></head> <body>
<hl>Demonstration work with "Sport" database</hl> <br>

...
<br>
<font color="red">SELECT * FROM country ORDER BY ID;</font>
<br>
<?php

try
{
  $pdo = new PDO('mysql:host=localhost;dbname=sport', 'igor', '2204');
  $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
  $pdo->exec('SET NAMES "utf8"');
}
catch (PDOException $e)
{
  $error = 'Unable to connect to the database server.';
  echo $error;
  include 'error.html.php';
  exit();
}


try
{
  $stmt = $pdo->query('SELECT * FROM country ORDER BY ID;');
}
catch (PDOException $e)
{
  $error = 'Error fetching country ' . $e->getMessage();
  include 'error.html.php';
  exit();
}
$stmt->setFetchMode(PDO::FETCH_ASSOC);


echo "<br><br><br>". "<strong>ID</strong>". "&nbsp;" . "&nbsp;". "&nbsp;". "&nbsp;". "&nbsp;". "<strong>Name</strong>";
while($row = $stmt->fetch())
{
    echo "<p>" . $row['ID'] . "&nbsp;" . "&nbsp;". "&nbsp;". "&nbsp;". "&nbsp;". $row['Name'] . "</p>";
    
}
	
?>
<br>
<input type="button" value = "Back" onclick="history.back()" style="width:140px; height:40px;">


</body> </html>


