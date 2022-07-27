function bai_1() {
    function Fibonacci(n) {
        if (n === 1 || n === 2){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    let num = prompt("Nhập số lượng số Fibonacci cần hiển thị: ");
    for (let i = 1; i <= num; i++){
        document.write(Fibonacci(i) + '<br>');
    }
}

function bai_2() {
    let giaiThua = 1;
    let n = Number(prompt("Nhập một số: "));
    while (n <= 0){
        alert("Số phải là nguyên dương!");
        n = Number(prompt("Nhập lại số nguyên dương: "));
    }
    for (let i = 1; i <= n; i++){
        giaiThua *= i;
    }
    alert("Giai thừa của số đã chọn là: "+ giaiThua);
}

function bai_3() {
    
}

function bai_4() {

}

function bai_5() {

}

function bai_6() {

}