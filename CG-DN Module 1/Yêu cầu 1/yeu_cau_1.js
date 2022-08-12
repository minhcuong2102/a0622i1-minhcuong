function bai1() {
    let width = Number(prompt("Nhập chiều dài: "));
    let height = Number(prompt("Nhập chiều rộng: "));
    for (let i = 1; i <= height; i++) {
        for (let j = 1; j <= width; j++) {
            if (i === 1 || j === 1 || i === height || j === width){
                document.write("*");
            }else {
                document.write("&nbsp&nbsp");
            }
        }
        document.write("<br>")
    }
}

function bai2() {
    let chieuCao = Number(prompt("Nhập chiều cao: "));
    while (chieuCao < 0){
        alert(prompt("Nhập lại chiều cao!"));
    }
    for (let i = 1; i <= chieuCao; i++) {
        for (let j = 1; j <= i; j++){
            if (i === chieuCao || j === 1 || j === i){
                document.write(" * ");
            }else{
                document.write("&nbsp&nbsp&nbsp");
            }
        }
        document.write("<br>");
    }
}

function bai3() {
    let height1 = Number(prompt("Nhập chiều cao: "));
    while (height1 < 0){
        alert(prompt("Nhập lại chiều cao!"));
    }
    for (let i = 1; i <= height1; i++) {
        for (let j = 0; j < 2 * height1; j++){
            if (Math.abs(height1 - j) <= i - 1){
                document.write(" * ");
            }else {
                document.write("&nbsp&nbsp&nbsp");
            }
        }
        document.write("<br>");
    }
}

function bai4() {
    let height2 = Number(prompt("Nhập chiều cao: "));
    while (height2 < 0){
        alert(prompt("Nhập lại chiều cao!"));
    }
    for (let i = 0; i < height2 - 1; i++) {
        for (let j = 0; j < 2 * height2 - 1; j++){
            if (j === height2 - i - 1 || j === height2 + i - 1){
                document.write(" * ");
            }else {
                document.write("&nbsp&nbsp&nbsp");
            }
        }
        document.write("<br>");
    }
    for (let i = 0; i < 2 * height2; i++){
        document.write(" * ");
    }
}