function bai3_1() {
    function prefixSums(){
        for (let i = 0; i < a.length; i++){
            let sum = 0;
            for (let j = 0; j <= i; j++) {
                sum += a[j];
            }
            b[i] = sum;
        }
        console.log(b);
    }

    function nhapPhanTu(arr){
        let soPhanTu = Number(prompt("Nhập số phần tử: "));
        for (let i = 0; i < soPhanTu; i++){
            arr.push(parseInt(prompt("Nhập phần tử thứ " + i + ":")));
        }
    }

    let a = [];
    let b = [];
    console.log(nhapPhanTu(a));
    prefixSums();
}

function bai3_2() {
    function missingValue(value, a) {
        for (let i = 0; i < a.length; i++) {
            if (a[i] === value){
                return false;
            }
        }
        return true;
    }

    function nhapPhanTu(arr){
        let soPhanTu = Number(prompt("Nhập số phần tử: "));
        for (let i = 0; i < soPhanTu; i++){
            arr.push(parseInt(prompt("Nhập phần tử thứ " + i + ":")));
        }
    }

    let a = [];
    let b = [];
    let c = [];
    console.log(nhapPhanTu(a), nhapPhanTu(b));
    for (let i = 0; i < b.length; i++) {
        if (missingValue(b[i], a)){
            c.push(b[i]);
        }
    }
    alert(c);
}

function bai3_3() {
    function nhapPhanTu(arr){
        let soPhanTu = Number(prompt("Nhập số phần tử: "));
        for (let i = 0; i < soPhanTu; i++){
            arr.push(parseInt(prompt("Nhập phần tử thứ " + i + ":")));
        }
    }

    function maxFraction(numerators, denominators) {
        let max = numerators[0]/denominators[0];
        let cnt = 0;
        for (let i = 0; i < numerators.length; i++) {
            if (numerators[i]/denominators[i] > max){
                max = numerators[i]/denominators[i];
                cnt = i;
            }
        }
        return cnt;
    }

    let numerators = [];
    let denominators = [];
    console.log(nhapPhanTu(numerators), nhapPhanTu(denominators));
    let a = maxFraction(numerators, denominators);
    alert(numerators[a] + "/" + denominators[a] + " là phân số lớn nhất, chỉ số là: " + a);
}

function bai3_4() {
    let a = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
    let b = ["Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"];
    let nhapSo = prompt("Nhập một số bất kỳ lớn hơn 0: ");
    let c = nhapSo.split("");
    function hienThi(c) {
        let d = [];
        for (let i = 0; i < c.length ; i++) {
            for (let j = 0; j < a.length ; j++) {
                if(c[i] == a[j]){
                    d[i] = b[j];
                }
            }
        }
        return d;
    }
    alert(hienThi(c).join(" "));
}
