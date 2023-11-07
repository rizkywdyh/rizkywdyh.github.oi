function calculateBMI() {
    var weight = document.getElementById("weight").value;
    var height = document.getElementById("height").value;
    var age = document.getElementById("age").value;
    var gender = document.getElementById("gender").value;
    var resultElement = document.getElementById("result");
    var bmi, interpretation, advice, impact;

    if (weight === "" || height === "" || age === "" || gender === "") {
        resultElement.innerText = "Mohon lengkapi semua input sebelum menghitung BMI.";
        resultElement.style.color = "black";
        return;
    }

    if (isNaN(weight) || isNaN(height) || isNaN(age)) {
        resultElement.innerText = "Mohon masukkan nilai numerik yang valid untuk berat, tinggi, dan usia.";
        resultElement.style.color = "black";
        return;
    }

    bmi = (weight / ((height / 100) * (height / 100))).toFixed(2);

    if (bmi < 18.5) {
        resultElement.style.color = "blue";
        interpretation = "Underweight";
        advice = "Untuk meningkatkan berat badan, pastikan Anda mengonsumsi makanan yang kaya nutrisi dan kalori. Konsultasikan dengan dokter atau ahli gizi untuk rekomendasi yang tepat.";
        impact = "Dampak underweight dapat termasuk penurunan energi, penurunan fungsi sistem kekebalan tubuh, dan risiko tinggi terhadap masalah kesehatan tulang.";
    } else if (bmi >= 18.5 && bmi < 25) {
        resultElement.style.color = "green";
        interpretation = "Normal weight";
        advice = "Untuk menjaga berat badan, penting untuk selalu menjaga pola makan yang seimbang dan berolahraga secara teratur. Tetap konsisten dengan gaya hidup sehat Anda.";
        impact = "Dengan mempertahankan berat badan yang sehat, Anda dapat mengurangi risiko terhadap berbagai penyakit dan meningkatkan kesejahteraan secara keseluruhan.";
    } else if (bmi >= 25 && bmi < 30) {
        resultElement.style.color = "orange";
        interpretation = "Overweight";
        advice = "Untuk menurunkan berat badan, penting untuk menjaga pola makan sehat dan rutin berolahraga. Konsultasikan dengan dokter atau ahli gizi untuk rencana penurunan berat badan yang aman dan efektif.";
        impact = "Dampak overweight dapat termasuk peningkatan risiko penyakit jantung, diabetes tipe 2, dan masalah kesehatan terkait.";
    } else {
        resultElement.style.color = "red";
        interpretation = "Obesity";
        advice = "Penting untuk segera mengadopsi pola makan sehat dan rutin berolahraga. Konsultasikan dengan dokter atau ahli gizi untuk rencana penurunan berat badan yang aman dan efektif.";
        impact = "Dampak obesitas dapat mencakup risiko tinggi terhadap berbagai penyakit serius, termasuk penyakit jantung, tekanan darah tinggi, diabetes, dan kondisi kesehatan lainnya.";
    }

    resultElement.innerHTML = `BMI Anda: ${bmi}. Anda termasuk kategori ${interpretation}. <br><br> Saran: ${advice} <br><br> Dampak: ${impact}`;
}

function resetForm() {
    document.getElementById("weight").value = "";
    document.getElementById("height").value = "";
    document.getElementById("age").value = "";
    document.getElementById("gender").value = "male";
    document.getElementById("result").innerText = "";
}