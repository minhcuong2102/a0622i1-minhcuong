function bai1() {
    alert("Xin chao");
}

function bai2() {
    function tangDonVi(n) {
        return ++n;
    }
    let num = Number(prompt("Nhập số: "));
    alert("Số mới là: " + tangDonVi(num));
}

function bai3() {
    function timSoLon(a, b){
        a = Number(prompt("Nhập số a: "));
        b = Number(prompt("Nhập số b: "));
        if (a > b) {
            alert("a lớn hơn b!");
        } else {
            return a + b;
        }
    }
    console.log(timSoLon(a, b));
}

function bai4() {
    function addNumbers(firstNum, secondNum, result) {
        firstNum = 4;
        secondNum = 8;
        result = firstNum + secondNum;
        return result;
    }
    let result = 0;
    alert("Giá trị cũ là: " + result);
    result = addNumbers();
    alert("Giá trị mới là: " + result);
}

function bai5() {
    function thuocChomSao(ngoiSao){
            if (arr1.includes(ngoiSao)){
                let index = arr1.indexOf(ngoiSao)
                alert("Ngôi sao " + ngoiSao + " thuộc chòm sao " + arr2[index]);
            }else {
                alert("Không tìm thấy ngôi sao nào!");
            }
        }
    let arr1 = ["Polaris", "Aldebaran", "Deneb", "Vega", "Altair", "Dubhe", "Regulus"];
    let arr2 = ["Ulsa Minor", "Tarurus", "Cygnus", "Lyra", "Aquila", "Ulsa Major", "Leo"];
    let ngoiSao = prompt("Nhập tên ngôi sao: ");
    thuocChomSao(ngoiSao);
}