
function loadData() {
    let languages = {
        "English" : "Hello",
        "Spanish" : "Hola",
        "Italian" : "Ciao",
        "Finnish" : "Hei",
        "Vorarlbergerisch" : "Habidere"
    }

    let selector = document.getElementById("language");
    let lang = selector.options[selector.selectedIndex].text;

    fetch('http://localhost:3000/hello')
    .then(response => response.json())
    .then(function(data) {
        document.querySelector('#greeting').innerHTML = languages[lang]
        document.querySelector('#name').innerHTML = data['name']
    })
}
