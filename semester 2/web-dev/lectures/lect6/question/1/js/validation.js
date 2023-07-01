class validate {
  static username(str) {
    if (typeof str !== "string") {
      return "username should be a string";
    }

    if (str === "") {
      return "username cannot be empty";
    }

    if (str.length <= 3) {
      return "username should be greater than 3 characters";
    }

    if (str.length >= 15) {
      return "username cannot be larger than 15 characters";
    }

    const regex = /^[a-zA-Z0-9_]+$/;
    if (!regex.test(str)) {
      return "username cannot have spaces and special characters";
    }

    return null;
  }

  static password(str) {
    if (typeof str !== "string") {
      return "password should be a string";
    }

    if (str === "") {
      return "password cannot be empty";
    }

    if (!/[!@#$%^&*(),.?":{}|<>]/.test(str)) {
      return "must conaim at least one special character";
    }

    if (!/[A-Z]/.test(str)) {
      return "must contain at least one upper case letter";
    }

    if (!/[a-z]/.test(str)) {
      return "must contain at least one lower case letter";
    }

    if (!/[0-9]/.test(str)) {
      return "must contain at least one number";
    }

    if (str.length <= 8) {
      return "must be greater than 8 characters";
    }

    return null;
  }

  static age(str) {
    if (isNaN(str)) {
      return "age must be a number";
    }

    if (str === "") {
      return "age cannot be empty";
    }

    try {
      const number = parseInt(str);
      if (number >= 80) {
        return "too old!";
      }

      if (number <= 20) {
        return "too young";
      }
    } catch (error) {
      return "age must be a number";
    }

    return null;
  }
}
