Things to improve:
- Rename the class for activity, remember it's a good practice to have the name of the activity to end in Activity. Your `Result` class should be `ResultActivity`

Description of the problem:
When you indicated that you want to pass the score as extra, you were passing as a String, and in `Result` activity you were extracting the String value as Integer which was wrong. Check the changes that I've made