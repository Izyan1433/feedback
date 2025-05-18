document.getElementById("feedbackForm").addEventListener("submit", function(event){
    event.preventDefault();

    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const message = document.getElementById("message").value.trim();

    if (name && email && message) {
        console.log("Feedback Submitted:");
        console.log("Name:", name);
        console.log("Email:", email);
        console.log("Message:", message);

        document.getElementById("responseMessage").innerText = "Thank you for your feedback!";
        this.reset();
    } else {
        document.getElementById("responseMessage").innerText = "Please fill all fields.";
    }
});
