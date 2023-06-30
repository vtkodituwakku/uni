
const backgroundColorIDs = [];
const foregroundColorIDs = [];

function changeForegroundColor(id, color) {
  const button = document.getElementById(id);

  if (foregroundColorIDs.includes(id)) {
    foregroundColorIDs.splice(foregroundColorIDs.indexOf(id), 1);
    button.style.color = "white";
    return;
  }

  foregroundColorIDs.push(id);
  button.style.color = color;
}

function changeBackgroundColor(id, color) {
  const button = document.getElementById(id);

  if (backgroundColorIDs.includes(id)) {
    backgroundColorIDs.splice(backgroundColorIDs.indexOf(id), 1);
    button.style.backgroundColor = "#4caf50";
    return;
  }

  backgroundColorIDs.push(id);
  button.style.backgroundColor = color;
}
