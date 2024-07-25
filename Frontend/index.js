var form = document.getElementById('taskForm');
console.log(form);
form.addEventListener('submit', (e) => {
  e.preventDefault();
  var nameInput = document.getElementById('nameInput').value;
  var descriptionInput = document.getElementById('descriptionInput').value;
  var taskBody = {
    name: nameInput,
    description: descriptionInput
  }
  fetch(`http://localhost:8080/api/task/create`, {
    method: 'POST',
    body: JSON.stringify(taskBody),
    headers: {
      'Access-Control-Allow-Origin': '*',
      'Content-Type': 'application/json'
    }
  })
  .then(res =>{
    if(res.status === 200) {
      alert('Task created successfully!');
    }}
  )
})