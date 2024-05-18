

$(document).ready(function(){
    $('#btn').click(function(){
        var ordrId = $('#orderId').val();
        var custName = $('#custName').val();
        var billingDate = $('#billing_date').val();
        var shippingDate = $('#shipping_date').val();
        var orderTotal = $('#order_total').val();

        validation(billingDate, shippingDate);

        $('#res').html(`Order ID: ${ordrId}<br>Customer Name: ${custName}<br>Billing Date: ${billingDate}<br>Shipping Date: ${shippingDate}<br>Order Total: ${orderTotal}<br>`);
    })
    
    function validation(billingDate, shippingDate){
        if(Date.parse(billingDate) > Date.parse(shippingDate)){
            alert("Billing date Must be before the Shipping date!")
        }
    }
})