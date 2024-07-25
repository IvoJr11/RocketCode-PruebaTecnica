var taskList = await getTaskList();
console.log(taskList);

var taskListContainer = document.getElementById('taskListContainer');
console.log(taskListContainer);

taskList.forEach(task => {
  var newTask = document.createElement('div');
  newTask.classList.add('taskCard');
  newTask.innerHTML = `
  <div class="first_row">
    <h5>${task.name}</h5>
    <p>${task.description}</p>
  </div>
  <small>${task.creationDate}</small>
  `
  taskListContainer.appendChild(newTask);
});


async function getTaskList() {
  var data = await fetch('http://localhost:8080/api/task/getAll', {
    method: 'GET',
    headers: {
      'Access-Control-Allow-Origin': '*'
    }
  })
  var res = await data.json();
  return res;
}