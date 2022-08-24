function bai5_1() {
    let row = Number(prompt("Nhập số hàng: "));
    let column = Number(prompt("Nhập số cột: "));
    let arr = new Array(row);
    for (let i = 0; i < arr.length; i++) {
        arr[i] = new Array(column);
    }
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr[i].length; j++) {
            arr[i][j] = parseInt(prompt("Nhập phần tử " + i + "-" + j));
        }
    }
    console.log(arr);

    function tinhTongSoChan(arr) {
        let tong = 0;
        for (let i = 0; i < arr.length; i++) {
            for (let j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 === 0) {
                    tong += arr[i][j];
                }
            }
        }
        return tong;
    }

    alert("Tổng các phần tử chẵn là: " + tinhTongSoChan(arr));
}

function bai5_2() {
    let row = Number(prompt("Nhập số hàng: "));
    let column = Number(prompt("Nhập số cột: "));
    let arr = new Array(row);
    for (let i = 0; i < arr.length; i++) {
        arr[i] = new Array(column);
    }
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr[i].length; j++) {
            arr[i][j] = parseInt(prompt("Nhập phần tử " + i + "-" + j));
        }
    }
    console.log(arr);

    function isPrime(n) {
        if (n < 2){
            return 0;
        }
        for (let i = 2; i <= Math.sqrt(n); i++){
            if (n % i === 0){
                return 0;
            }
        }
        return 1;
    }
    function check(arr) {
        let mang = [];
        for (let i = 0; i < arr.length; i++) {
            for (let j = 0; j < arr[i].length; j++) {
                if (isPrime(arr[i][j])){
                    mang.push(arr[i][j]);
                }
            }
        }
        alert("Có " + mang.length + " số nguyên tố trong mảng: " + mang.join(", "))
    }
    check(arr);
}

function bai5_3() {
    let row = Number(prompt("Nhập số hàng: "));
    let column = Number(prompt("Nhập số cột: "));
    let arr1 = new Array(row);
    for (let i = 0; i < arr1.length; i++) {
        arr1[i] = new Array(column);
    }
    for (let i = 0; i < arr1.length; i++) {
        for (let j = 0; j < arr1[i].length; j++) {
            arr1[i][j] = parseInt(prompt("Nhập phần tử " + i + "-" + j));
        }
    }
    console.log(arr1);

    function findMax(arr) {
        let max = arr[0][0];
        for (let i = 0; i < arr.length; i++) {
            for (let j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    function findMin(arr) {
        let min = arr[0][0];
        for (let i = 0; i < arr.length; i++) {
            for (let j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    alert("Số lớn nhất là: " + findMax(arr1) + ", số nhỏ nhất là: " + findMin(arr1));
}