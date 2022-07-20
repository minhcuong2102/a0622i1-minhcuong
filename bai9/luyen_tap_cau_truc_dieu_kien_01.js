function bai1() {
    let a = parseInt(prompt("Nhập a: ")),
        b = parseInt(prompt("Nhập b: "));
    if (a % b === 0) {
        alert("a chia hết cho b!");
    } else {
        alert("a không chia hết cho b!")
    }
}

function bai2() {
    let tuoi = parseInt(prompt("Nhập số tuổi: "));
    if (tuoi < 16){
        alert("Không đủ tuổi vào lớp 10!");
    }
    else {
        alert("Đủ tuổi vào lớp 10!");
    }
}

function bai3() {
    let num1 = parseInt(prompt("Nhập số nguyên: "));
    if (num1 > 0){
        document.getElementById(".bai3").innerHTML("Kết quả: " + num1 + " lớn hơn 0!");
    }
}

function bai4() {

}

function bai5() {

}

function bai6() {

}

function bai7() {

}