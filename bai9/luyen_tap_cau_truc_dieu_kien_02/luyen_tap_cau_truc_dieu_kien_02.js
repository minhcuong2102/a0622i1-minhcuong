function bai01() {
    let doC = parseInt(prompt("Nhập độ C: "));
    let doF = doC * 9/5 + 32;
    alert("Độ F là: " + doF);
}

function bai02() {
    let m = parseInt(prompt("Nhập độ dài bằng mét: "));
    let ft = m * 3.2808;
    alert("ĐỘ dài bằng feet là: " + ft);
}

function bai03() {
    let a = parseInt(prompt("Nhập cạnh hình vuông: "));
    let S = a^2;
    alert("Diện tích hình vuông là: " + S);
}

function bai04() {
    let a = parseInt(prompt("Nhập cạnh a: ")),
        b = parseInt(prompt("Nhập cạnh b: "));
    let S = a*b;
    alert("Diện tích hình chữ nhật là: "+ S);
}

function bai05() {
    let a = parseInt(prompt("Nhập cạnh a: ")),
        b = parseInt(prompt("Nhập cạnh b: "));
    let S = a*b/2;
    alert("Diện tích hình tam giác vuông là: "+ S);
}

function bai06() {
    let a = parseInt(prompt("Nhập cạnh a: ")),
        b = parseInt(prompt("Nhập cạnh b: "));
    if (a == 0){
        if (b == 0){
            alert("")
        }
    }
}