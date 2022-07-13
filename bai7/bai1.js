let inputPhysics = prompt("Nhập điểm Lý: "),
    inputChemistry = prompt("Nhập điểm Hoá: "), inputBiology = prompt("Nhập điểm Sinh: ");
let physics = parseInt(inputPhysics), chemistry = parseInt(inputChemistry), biology = parseInt(inputBiology);
let total = (physics + chemistry + biology);
document.write("Tổng điểm: " + total + '<br>');
let average = (total / 3);
document.write("Điểm trung bình: " + average + '<br>');