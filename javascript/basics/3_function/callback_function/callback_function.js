function connectToServer(ip, funcYes, funcNo) {
    ///Call network 
    let connected = false;
    if (connected) {
        funcYes();
    } else {
        funcNo();
    }
}
function onSuccess() {
    console.log("Connected...");
}

function showFail() {
    console.log("Connection failed");
}
connectToServer("192.x.x.x", onSuccess, showFail);