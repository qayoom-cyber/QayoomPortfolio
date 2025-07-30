// Add qualification dynamically
function addQualification() {
  const input = document.getElementById("newQual");
  const qualList = document.getElementById("qualList");

  if (input.value.trim() !== "") {
    const li = document.createElement("li");
    li.textContent = input.value;
    qualList.appendChild(li);
    input.value = "";
  } else {
    alert("Please enter a qualification.");
  }
}
