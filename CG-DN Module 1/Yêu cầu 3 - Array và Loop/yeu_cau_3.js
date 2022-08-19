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
    let a = [];
    let b = [];
    let soPhanTu = Number(prompt("Nhập số phần tử: "));
    for (let i = 0; i < soPhanTu; i++){
        a.push(parseInt(prompt("Nhập phần tử thứ " + i + ":")));
    }
    console.log(a);
    prefixSums();
}

function bai3_2() {
    
}

function bai3_3() {

}

function bai3_4() {

}

function bai3_5() {

}
