<html>
<body>

<?php
class Student
{
    public $name;
    public $marks;

    //* @param string $name "The name of the student"
    //* @param number $marks "The marks of the student"
    function __construct($name, $marks)
    {
        $this->name = $name;
        $this->marks = $marks;
    }
}

$students = array(
  new Student(name: "kskfkskf", marks: 88),
  new Student(name: "kskfskf", marks: 77),
  new Student(name: "sfksfskfk", marks: 66),
);

foreach ($students as $student) {
    if ($student->marks >= 75 &&  $student->marks <= 100) {
        echo "<h1>$student->name : A</h1>";
    }
}

?>

</body>
</html>
