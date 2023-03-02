import { initializeApp } from "https://www.gstatic.com/firebasejs/9.4.0/firebase-app.js";
import { getDatabase, ref, onValue, child, get} from "https://www.gstatic.com/firebasejs/9.4.0/firebase-database.js";

const firebaseConfig = {
    apiKey: "AIzaSyC77Uw3NkfnSeAvDQiVhd7yGem4ZdSNAcs",
    authDomain: "objop-c215b.firebaseapp.com",
    databaseURL: "https://objop-c215b-default-rtdb.asia-southeast1.firebasedatabase.app",
    projectId: "objop-c215b",
    storageBucket: "objop-c215b.appspot.com",
    messagingSenderId: "832743787035",
    appId: "1:832743787035:web:06fb9247529454cceb46be"
  };

const app = initializeApp(firebaseConfig);

const dbRef = ref(getDatabase(app));

get(child(dbRef, `users`)).then((snapshot) => {
  if (snapshot.exists()) {
    console.log(snapshot.val());
    for (const [key, value] of Object.entries(snapshot.val())) {
        console.log(`${key}: ${value}`);
        document.getElementById("addHere").innerHTML += "<p>" + key + " = " + JSON.stringify(value) + "</p>";
    }
  } else {
    console.log("No data available");
  }
}).catch((error) => {
  console.error(error);
});

