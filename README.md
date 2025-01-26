# AutoShift

The project is a website for selling vehicles. There users can register, log in, CRUD listings. 

## Fetures

### User Features
* **User Authentication:** Login and register system
* **Vehicle Listings:** Users can create, edit, and delete car listings that they have created
* **Search & Filer:** Advanced search and filter for car specifications such as make, model, engine type, gearbox type, region, location, body type, min price and max price.
* **Image Uploads:** Upload images for car listings, with one main image per listing
* **Pagination:** Browse listings efficiently with paginated views

### Admin Features
* Monitor and manage listings

## Technology Stack

### Frontend: 
* **React:** For building user interface 
* **Vite:** For faster development build processes
* **Axios:** For easier requests to the backend
* **Redux And Redux Persist:** For easier handling of data
* **Styled Components:** For styling and responsive design
* **React Router:** For handling navigation between pages
* **React Icons:** For using icons
* **Swiper:** For easier integration of image slideshow

### Backend
* **Java Spring Boot:** For RESTful API development
* **Hibernate:** For mapping classes to the database
* **PostgreSQL:** As the database for storing data
* **Maven:** For dependency management in Spring
* **JJWT:** For creating and validating JWT tokens
* **Lombok** For easier creation of get and set methods
* **Spring Security**: For Authentication and authorization

### Other Tools
* **Postman** For API testing

## System Architecture

* **Frontend:** Communicates with the backend via RESTful APIs
* **Backend:** Manages business logic, data processing, and interacts with database
* **Database:** Sotes user data, vehicle listings, and images.

## Database Design
![Database Design](https://github.com/MartinGeorgiev-14/AutoShiftProject/blob/main/db.png)

## Backend Implementation

### Key modules
* **Authentication module:** Handles user registration, login, role-based authorization
* **Listing Module:** Provides CRUD operations, filtering, and pagination for listings

## Endpoints

* **/api/auth/register:** Register a new user
* **/api/auth/login:** Authenticate user
* **/api/auth/getUserInfo:** Returns user information
* **/api/app/:** Returns list of all listings
* **/api/app/{id}:** Returns single listing by id
* **/api/app/page?pageNo={number}&pageSize={number}:** Returns a page of listings
* **/api/app/create:** Creates a new listing
* **/api/app/update/{id}:** Patches listing with new data

## Frontend Implementation

### Key Components
* **Login And Register Pages:** Allow users to register and log in
* **Search Page:** Allows users to search listings based on criteria
* **Result Search Page:** Shows all listings that have been found from the search
* **Listing Page:** Shows more information about listing
* **My Listings Page** Shows all listings that the user has made. If the user has an admin role, it shows all listings. Both the owner and admin can delete and edit the listing.
* **Edit Listing Page** Edit data of listing





