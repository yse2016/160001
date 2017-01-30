var five = require("johnny-five"),
board,button;

board = new five.Board();

board.on("ready",function(){
    button = new five.Button(3);

    board.repl.inject({
        button: button
    });
    var piezo = new five.Piezo(13);
    board.repl.inject({
        piezo: piezo
    });

    button.on("down", function(){
        console.log("down");
         piezo.tone(440,2000);
    });
    button.on("up", function(){
        console.log("up");
        piezo.noTone();
    });
});