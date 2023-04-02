# OOP G2T1
## To run
1. Ensure that maven is installed in your laptop environment <br>
For MAC users, [Go to this Web Site](https://javabydeveloper.com/how-to-install-maven-on-mac-osx/)  <br>
For Windows users, [Go to this Web Site](https://maven.apache.org/download.cgi) 
2. Ensure that there is node_modules folder in the directory mongodb/src/main/ui. If not, run "npm i" in this directory
2. Run "run run.bat" in the terminal
<br><br>
Alternatively,

1. Run "npm i" in mongodb/src/main/ui
2. Run "npm run serve" in mongodb/src/main/ui  (this is to run the frontend)
3. In a new command prompt, run "java mongodb/src/main/java/com/example/mongodb MongodbApplication.java"  (this is to run the backend)

## Accounts
1. Vendor
Email: glenvendor@gmail.com
Password: Oopg1t9!

2. Admin
Email: quantum@gmail.com
Password: aA111111

3. Approver
Email: glen@gmail.com
Password: Oopg1t9!

Forms: <br>
Pre Evaluation Form<br>
<img width="500" alt="" src="img/preeval1.png"><br>
<img width="500" alt="" src="img/preeval2.png"><br>
<img width="500" alt="" src="img/preeval3.png"><br>
<img width="500" alt="" src="img/preeval4.png"><br>
<code>http://localhost:3000/Safety&HealthPreEvaluation</code>

Performance Evaluation Form <br>
<img width="500" alt="" src="img/perfeval1.png"><br>
<img width="500" alt="" src="img/perfeval2.png"><br>
<img width="500" alt="" src="img/perfeval3.png"><br>
<code>http://localhost:3000/performanceevaluation</code>

Vendor Assessment Form <br>
<img width="500" alt="" src="img/newvendor1.png"><br>
<img width="500" alt="" src="img/newvendor2.png"><br>
<img width="500" alt="" src="img/newvendor3.png"><br>
<code>http://localhost:3000/newvendorform</code>

Performance Evaluation Report <br>
<img width="500" alt="" src="img/perfevalreport1.png"><br>
<img width="500" alt="" src="img/perfevalreport1.png"><br>
<code>http://localhost:3000/adminapprove</code>

## Login Page
<img width="500" alt="" src="img/login.png"><br>
<code>http://localhost:3000/login</code>

<img width="500" alt="" src="img/sso.png"><br>
Single Sign On page using Auth0 authentication service

## Profile Page
<img width="500" alt="" src="img/profile.png"><br>
<code>http://localhost:3000/profile</code>

## Vendor
### Home page
<img width="500" alt="" src="img/vendorhomepage.png"><br>
<code>http://localhost:3000/home</code>

Vendor sees all forms they are assigned to by the vendor
Vendor sees the status of the forms

#### Fill Up Form
<img width="500" alt="" src="img/savesubmit.png"><br>
<ins>Save Form<ins> <br>

* Vendor fills up the form halfway
* Vendor can save the form if it is incompleted (no validation of form when saving)

<ins>Submit Form<ins> <br>

* Vendor fills up the form completely
* Vendor clicks submit and form validation occurs. If any required fields are empty, form submission is unsuccessful and highlights to the vendor the fields that are empty. Otherwise, the form submission is successful and status changes from Incompleted to Pending Evaluation

## Admin
### Home page
Admin sees all forms <br>

<img width="500" alt="" src="img/adminhomepage.png"><br>
<code>http://localhost:3000/home</code>

Statuses: 
1. Upon assign -> Incomplete!
2. Upon submit -> Pending Admin Evaluation!
3. Upon admin reject -> Admin Rejected!
4. Upon admin approve -> Pending Approval!
5. Upon approver reject -> Approver Rejected!
6. Upon approver approve -> Approved!

#### Evaluate Form

* Blue pen button refers to an action required from the admin to evaluate the form
* Upon clicking the evaluate button Admin sees the form with inputs filled and submitted by the vendor
<img width="500" alt="" src="img/approverejeval.png"><br>

<ins>Approve Evaluation<ins> <br>

* Admin fills up some evaluation fields and signs the form
* Admin clicks Approve Evaluation button
* Form status changes from 'Pending Admin Evaluation' to 'Pending Approval'

<ins>Reject Evaluation<ins> <br>
<img width="500" alt="" src="img/statereason.png"><br>

* Admin fills up the rejection reason and clicks reject evaluation
* Form status changes from 'Pending Admin Evaluation' to 'Admin Rejected' <br>

<img width="500" alt="" src="img/highlightrejection.png"><br>

* On the Vendor's end, they see the reason for the rejection when they open the form
#### Print Approved Form

* Green print button appears when the form status is approved 
* Upon clicking the print button, admin enters into the form and clicks the blue print button at the bottom of the form
* PDF file of the form is downloaded 
<br>
<img width="500" alt="" src="img/printpdf.png"><br>

#### Send Email Alert to Vendor
* Yellow alert button appears when the form status is still incomplete
* Upon clicking the alert button, an email from the admin will be sent to the vendor as a reminder to complete the form<br>
<img width="500" alt="" src="img/email.png"><br>

* Email received by vendor reminding to complete the form by the deadline 

#### Delete Workflow
* Red delete button where admin can delete a workflow for the vendor

### Admin page
Admin sees all accounts in the system <br>
<img width="500" alt="" src="img/adminpage.png"><br>
<code>http://localhost:3000/admin</code>


#### Assign New Workflow 
<img width="500" alt="" src="img/assignform.png"><br>

* Yellow hand point button refers to assigning workflow for admin to assign a new workflow to the vendor
* Upon clicking the assign workflow button, admin needs to choose which of the 3 forms to assign to the vendor
* Admin cannot assign a workflow that is already assigned to the vendor
#### Create New Account
<img width="500" alt="" src="img/createnewacc.png"><br>
<code>http://localhost:3000/createnewacc</code>

* Upon clicking the green create new account button, admin enters the create new account page to fill in the fields for a new vendor
* Admin fills up the company name, email, password (hashed), access rights, location of operations 
* Admin clicks submit and a new account is created  
* An email is auto sent to the vendor when admin assigns a workflow to them <br>
<img width="500" alt="" src="img/emailuponassign.png"><br>

#### Edit Vendor Account Details
<img width="500" alt="" src="img/editaccountdetails.png"><br>

* Blue pen button refers to edit account details action
* Upon clicking the edit button, admin can edit the name, access right and location of the account

#### Delete Vendor Account
* Red delete button where admin can delete an account

## Approver
### Home page
<img width="500" alt="" src="img/approverhomepage.png"><br>
<code>http://localhost:3000/home</code>

Approver sees all forms that are approved and requires approve action
#### Form Approval
<img width="500" alt="" src="img/approverej.png"><br>

* Blue pen button refers to an action required from the Approver to approve the form
* Upon clicking the approve button Approver sees the form with inputs filled and submitted by the vendor and admin

<ins>Approve Form<ins> <br>

* Approver fills up some evaluation fields and signs the form
* Approver clicks Approve button
* Form status changes from 'Pending Approval' to 'Approved'

<ins>Reject Form<ins> <br>

* Approver clicks Reject button
* Form status changes from 'Pending Approval' to 'Rejected'
