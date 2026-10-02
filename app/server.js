const express = require("express");

const app = express();
const PORT = 3000;

app.get("/", (req, res) => {
    res.send("Hello from 24WH1A05M2 - Kubernetes DevOps Application!");
});

app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});
