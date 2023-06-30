
const marks = [];

// Validate wether the marks input receives a non input mark
document.getElementById("marks").addEventListener("change", function() {
  const value = document.getElementById("marks").value;
  try {
    if (isNaN(parseFloat(value))) {
      throw Error("Not a number");
    }
  } catch (error) {
    alert("Cannot enter non numeric input");
  }
})

function storeMarks() {
  const mark = parseFloat(document.getElementById("marks").value);
  if (isNaN(mark)) {
    return;
  }

  marks.push(mark);
}

function calAverage() {
  if (marks.length ===  0) {
    alert("Please add marks first !")
    return
  }
  let sum = 0;
  for (let i = 0; i < marks.length; i++) {
    sum += marks[i];
  }

  const average = sum / marks.length;
  document.getElementById("display").innerText = `The total is : ${sum}\nThe average is : ${average}`;
}
