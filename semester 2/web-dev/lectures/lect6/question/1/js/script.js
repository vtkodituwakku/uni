function showErrMsg(errMsg, id) {
  const err = document.getElementById(`${id}:error`);
  err.style.display = "block";
  err.innerText = errMsg;
}

function dismissErrMsg(id) {
  const err = document.getElementById(`${id}:error`);
  err.innerText = "";
  err.style.display = "none";
}

function dismissAllErrs() {
  const errs = document.getElementsByClassName("err");
  for (const err of errs) {
    err.innerText = "";
    err.style.display = "none";
  }
}

let hasUsernameErr = true;
let hasPasswordErr = true;
let hasConfirmPasswordErr = true;
let hasAgeErr = true;
let hasGenderErr = true;
let hasQualificationsErr = true;
let hasCountryErr = true;

const usernameBaseID = "username";
const usernameInput = document.getElementById(`${usernameBaseID}:input`);
function usernameValidation() {
  const err = validate.username(usernameInput.value);
  if (err) {
    hasUsernameErr = true;
    showErrMsg(err, usernameBaseID);
  } else {
    hasUsernameErr = false;
    dismissErrMsg(usernameBaseID);
  }
}
usernameInput.addEventListener("change", usernameValidation);

const passwordBaseID = "password";
const passwordInput = document.getElementById(`${passwordBaseID}:input`);
function passwordValidation() {
  const err = validate.password(passwordInput.value);
  if (err) {
    hasPasswordErr = true;
    showErrMsg(err, passwordBaseID);
  } else {
    hasPasswordErr = false;
    dismissErrMsg(passwordBaseID);
  }
}
passwordInput.addEventListener("change", passwordValidation);

const confirmPasswordBaseID = "confirmPassword";
const confirmPasswordInput = document.getElementById(
  `${confirmPasswordBaseID}:input`
);
function confirmPasswordValidation() {
  if (confirmPasswordInput.value !== passwordInput.value) {
    hasConfirmPasswordErr = true;
    showErrMsg("passwords do not match", confirmPasswordBaseID);
  } else {
    hasConfirmPasswordErr = false;
    dismissErrMsg(confirmPasswordBaseID);
  }
}
confirmPasswordInput.addEventListener("change", confirmPasswordValidation);

const ageBaseID = "age";
const ageInput = document.getElementById(`${ageBaseID}:input`);
function ageValidation() {
  const err = validate.age(ageInput.value);
  if (err) {
    hasAgeErr = true;
    showErrMsg(err, ageBaseID);
  } else {
    hasAgeErr = false;
    dismissErrMsg(ageBaseID);
  }
}
ageInput.addEventListener("change", ageValidation);

const gender = "gender";
const genderRadio = document.getElementsByName(gender);
function genderValidation() {
  if (!(genderRadio[0].checked && genderRadio[0].checked)) {
    hasGenderErr = true;
    showErrMsg("please select a gender", gender);
  } else {
    hasGenderErr = false;
    dismissErrMsg(gender);
  }
}
for (const g of genderRadio) {
  g.addEventListener("change", function () {
    hasGenderErr = false;
    dismissErrMsg(gender);
  });
}

const qualifications = "qualifications";
const qualficationsCheckBox = document.getElementsByName(qualifications);
function qualificationValidation() {
  if (!qualficationsCheckBox[0].checked && !qualficationsCheckBox[1].checked) {
    hasQualificationsErr = true;
    showErrMsg("add your qualifications", qualifications);
  } else {
    hasQualificationsErr = false;
    dismissErrMsg(qualifications);
  }
}
for (const q of qualficationsCheckBox) {
  q.addEventListener("change", function () {
    hasQualificationsErr = false;
    dismissErrMsg(qualifications);
  });
}

const countryBaseID = "country";
const countryOptions = document.getElementById(countryBaseID);
function countryValidation() {
  if (countryOptions.value === "s") {
    hasCountryErr = true;
    showErrMsg("please select your country", countryBaseID);
  } else {
    hasCountryErr = false;
    dismissErrMsg(countryBaseID);
  }
}
countryOptions.addEventListener("change", function () {
  hasCountryErr = false;
  dismissErrMsg(countryBaseID);
});

const form = document.getElementsByTagName("form")[0];
form.addEventListener("reset", function () {
  dismissAllErrs();
});
form.addEventListener("submit", function (event) {
  event.preventDefault();

  usernameValidation();
  passwordValidation();
  confirmPasswordValidation();
  ageValidation();
  genderValidation();
  qualificationValidation();
  countryValidation();

  if (
    hasUsernameErr ||
    hasPasswordErr ||
    hasConfirmPasswordErr ||
    hasAgeErr ||
    hasGenderErr ||
    hasQualificationsErr ||
    hasCountryErr
  ) {
    return;
  }

  alert("Form submitted successfully");
});
