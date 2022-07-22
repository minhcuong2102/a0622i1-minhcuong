function baiTap1() {
    let inputPhysics = prompt("Nhập điểm Lý: "),
        inputChemistry = prompt("Nhập điểm Hoá: "), inputBiology = prompt("Nhập điểm Sinh: ");
    let physics = parseInt(inputPhysics), chemistry = parseInt(inputChemistry), biology = parseInt(inputBiology);
    let total = (physics + chemistry + biology);
    document.write("Tổng điểm: " + total + '<br>');
    let average = (total / 3);
    document.write("Điểm trung bình: " + average + '<br>');
}

function baiTap2() {
    let inputCelcius = prompt("Nhập độ C: ");
    let celcius = parseInt(inputCelcius);
    let fahrenheit = 9/5 * celcius + 32;
    document.write("Độ F bằng: " + fahrenheit);
}

function baiTap3() {
    let inputRadius = prompt("Nhập bán kính: ");
    let r = parseInt(inputRadius);
    let surface = r*r*3.14;
    document.write("Diện tích hình tròn: " + surface);
}

function baiTap4() {
    let inputBanKinh = prompt("Nhập bán kính: ");
    let bankinh = parseInt(inputBanKinh);
    let circulation = bankinh*2*3.14;
    document.write("Chu vi bằng: " + circulation);
}