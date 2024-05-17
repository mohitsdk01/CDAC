

$(document).ready(function(){
    $('#compute').click(function(){
        var amtOfLoan = parseFloat($('#loan').val());
        var rate = parseFloat($('#rate').val());
        var repayment = parseFloat($('#repayment').val());
        validations(amtOfLoan, repayment);
        let EMI = calculateMonthlyPayment(amtOfLoan, rate, repayment)
        let total = totalPayment(amtOfLoan, rate, repayment)
        let interest = total - amtOfLoan;
        $('#monthly_payment').val(EMI);
        $('#total_payment').val(total);
        $('#interest_payment').val(interest);
    })

    
    function validations(amtOfLoan, repayment){
        if(amtOfLoan > 1500000){
            alert("Amount should be between 1 to 15Lakhs")
        }
        if((repayment < 7 || repayment > 15)){
            alert("Repayment years should be between 7 to 15 years")
        }
    }

    function calculateMonthlyPayment(amtOfLoan, rate, repayment){
        let months = repayment * 12;
        const interest = (amtOfLoan * (rate * 0.01)) / months;
        const total = ((amtOfLoan / months) + interest).toFixed(2);
        return total.toFixed(2);
    }

    function totalPayment(amtOfLoan, rate, repayment){
        let SI = (amtOfLoan * rate * repayment)/100;
        let totalamt = SI+amtOfLoan;
        return totalamt.toFixed(2);
    }
})