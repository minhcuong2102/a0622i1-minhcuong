function bai1() {
    for (let i = 1; i <= 100; i++) {
        document.write(i + '<br>');
        if (i === 99){
            alert("Đã hoàn thành");
        }
    }
}

function bai2() {
    let nhietDo = prompt("Nhập nhiệt độ: ");
    while (nhietDo < 20 || nhietDo > 100){
        if (nhietDo < 20){
            nhietDo = prompt("Tăng nhiệt độ!");
        }
        if (nhietDo > 100){
            nhietDo = prompt("Giảm nhiệt độ!");
        }
    }
}

function bai3() {
    function fibonacci(n) {
        if (n === 1 || n === 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    let num = prompt("Nhập số lượng số Fibonacci cần hiển thị: ");
    for (let i = 1; i <= num; i++){
        document.write(fibonacci(i) + '<br>');
    }
}

function bai4() {
    function fibonacci(n) {
        if (n === 1 || n === 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


}

function bai5() {

}

function bai6() {

}

function bai7() {

}

function bai8() {

}