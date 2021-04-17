const express = require('express')
const cors = require('cors')
const app = express()
const port = 3000

app.use(cors())

app.get('/', (req, res) => {
    res.send('Hello World!')
})

app.get('/hello', (req, res) => {
    var response = {
        name : get_random_name()
    }
    res.json(response)
})

function get_random_name() {
    const names = ['Rick', 'Morty', 'Jerry', 'Summer', 'Beth', 'Bird Person']
    return names[ Math.floor(Math.random() * names.length) ]
}

app.listen(port, () => {
    console.log(`Example app listening at http://localhost:${port}`)
})
