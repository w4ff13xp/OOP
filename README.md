# OOP G2T1
## To run
1. cd mongodb/src/main/ui
2. npm i
3. npm run serve
4. In new terminal, run java mongodbapplication.java

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

Forms: 
Pre Evaluation Form
<!-- <img width="500" alt="" src="img/profile.png"><br> -->

Performance Evaluation Form
<!-- <img width="500" alt="" src="img/profile.png"><br> -->

Vendor Assessment Form
<!-- <img width="500" alt="" src="img/profile.png"><br> -->

## Login Page
<img width="500" alt="" src="img/login.png"><br>

<img width="500" alt="" src="img/sso.png"><br>
Single Sign On page using Auth0 authentication service

## Profile Page
<img width="500" alt="" src="img/profile.png"><br>

## Vendor
### Home page
<!-- <img width="500" alt="" src="img/profile.png"><br> -->

* Vendor sees all forms they are assigned to by the vendor
* Vendor sees the status of the forms

<!-- <img width="500" alt="" src="img/profile.png"><br> -->

#### Save Form
* Vendor fills up the form halfway
* Vendor can save the form if it is incompleted (no validation of form when saving)
#### Submit Form
* Vendor fills up the form completely
* Vendor clicks submit and form validation occurs. If any required fields are empty, form submission is unsuccessful and highlights to the vendor the fields that are empty. Otherwise, the form submission is successful and status changes from Incompleted to Pending Evaluation

## Admin
### Home page
<!-- <img width="500" alt="" src="img/profile.png"><br> -->

* Admin sees all forms
Statuses: 
Upon assign -> Incomplete!
Upon submit -> Pending Admin Evaluation!
Upon admin reject -> Admin Rejected!
Upon admin approve -> Pending Approval!
Upon approver reject -> Approver Rejected!
Upon approver approve -> Approved!

#### Evaluate Form

<!-- <img width="500" alt="" src="img/profile.png"><br> -->

* Blue pen button refers to an action required from the admin to evaluate the form
* Upon clicking the evaluate button Admin sees the form with inputs filled and submitted by the vendor

<ins>Approve Evaluation<ins> <br>

* Admin fills up some evaluation fields and signs the form
* Admin clicks Approve Evaluation button
* Form status changes from 'Pending Admin Evaluation' to 'Pending Approval'

<ins>Reject Evaluation<ins> <br>

* Admin fills up the rejection reason and clicks reject evaluation
* Form status changes from 'Pending Admin Evaluation' to 'Admin Rejected'
#### Print Approved Form

<!-- <img width="500" alt="" src="img/profile.png"><br> -->

* Green print button appears when the form status is approved 
* Upon clicking the print button, admin enters into the form and clicks the blue print button at the bottom of the form
* PDF file of the form is downloaded 
<!-- <img width="500" alt="" src="img/profile.png"><br> -->

#### Send Email Alert to Vendor
* Yellow alert button appears when the form status is still incomplete 3 days before the deadline
* Upon clicking the alert button, an email from the admin will be sent to the vendor as a reminder to complete the form
<!-- <img width="500" alt="" src="img/email.png"><br> -->

#### Delete Workflow
* Red delete button where admin can delete a workflow for the vendor

### Admin page
<!-- <img width="500" alt="" src="img/profile.png"><br> -->

* Admin sees all accounts in the system

#### Assign New Workflow 
<img width="500" alt="" src="img/assignform.png"><br>

* Yellow hand point button refers to assigning workflow for admin to assign a new workflow to the vendor
* Upon clicking the assign workflow button, admin needs to choose which of the 3 forms to assign to the vendor
* Admin cannot assign a workflow that is already assigned to the vendor
#### Create New Account
<img width="500" alt="" src="img/createnewacc.png"><br>

* Upon clicking the green create new account button, admin enters the create new account page to fill in the fields for a new vendor
* Admin fills up the company name, email, password (hashed), access rights, location of operations 
* Admin clicks submit and a new account is created  

#### Edit Vendor Account Details
<img width="500" alt="" src="img/editaccountdetails.png"><br>

* Blue pen button refers to edit account details action
* Upon clicking the edit button, admin can edit the name, access right and location of the account

#### Delete Vendor Account
* Red delete button where admin can delete an account

## Approver
### Home page
<img width="500" alt="" src="img/approverhomepage.png"><br>

* Approver sees all forms that are approved and requires approve action
#### Approve Form
* Blue pen button refers to an action required from the Approver to approve the form
* Upon clicking the approve button Approver sees the form with inputs filled and submitted by the vendor and admin
* Approver fills up some evaluation fields and signs the form
* Approver clicks Approve button
* Form status changes from 'Pending Approval' to 'Approved'
