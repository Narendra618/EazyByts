function register() {
  const username = document.getElementById('username').value;
  const password = document.getElementById('password').value;

  fetch('/api/auth/register', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({ username, password })
  }).then(res => res.text()).then(alert);
}

function login() {
  const username = document.getElementById('username').value;
  const password = document.getElementById('password').value;

  fetch('/api/auth/login', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({ username, password })
  }).then(res => res.text()).then(alert);
}
