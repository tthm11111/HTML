
// Filter courses by level

//
// Select the element with the ID "m_level-filter" and add an event listener for when its value changes
document.querySelector('#m_level-filter').addEventListener('change', function(event) {
    // When the event fires, store the selected value in a variable called selectedLevel
    const selectedLevel = event.target.value;
    // Select all elements with the class "m_course" and store them in a variable called courses
    const courses = document.querySelectorAll('.m_course');
    // Loop through each course element
    courses.forEach(function(course) {
      // For each course element, select the first paragraph element and extract the text content after the colon. 
      // Trim any leading or trailing white space and store the result in a variable called courseLevel
      const courseLevel = course.querySelector('p:nth-of-type(1)').textContent.split(':')[1].trim();
      // Check if the selectedLevel is empty (indicating no filter is applied) or if it matches the courseLevel.
      // If it matches, display the course element by setting its display style to "block".
      // Otherwise, hide the course element by setting its display style to "none".
      if (selectedLevel === '' || courseLevel === selectedLevel) {
        course.style.display = 'block';
      } else {
        course.style.display = 'none';
      }
    });
  });

  
  // Sort courses by level
  // Select the element with the ID "m_level-sort" and add an event listener for when its value changes
document.querySelector('#m_level-sort').addEventListener('change', function(event) {
    // When the event fires, store the selected value in a variable called sortType
    const sortType = event.target.value;
    // Select all elements with the class "m_course" and store them in a variable called courses
    const courses = document.querySelectorAll('.m_course');
    // Convert the courses NodeList to an Array and sort it based on the selected sort type
    const sortedCourses = Array.from(courses).sort(function(a, b) {
      // For each course element, select the first paragraph element and extract the text content after the colon.
      // Convert the result to an integer and store it in variables called aLevel and bLevel, respectively
      const aLevel = parseInt(a.querySelector('p:nth-of-type(1)').textContent.split(':')[1].trim());
      const bLevel = parseInt(b.querySelector('p:nth-of-type(1)').textContent.split(':')[1].trim());
      // If the sort type is "asc" (ascending), return the difference between aLevel and bLevel to sort the array in ascending order.
      // Otherwise, return the difference between bLevel and aLevel to sort the array in descending order.
      if (sortType === 'asc') {
        return aLevel - bLevel;
      } else {
        return bLevel - aLevel;
      }
    });
    // Loop through each sorted course element and append it to the container element with the ID "courses-container".
    sortedCourses.forEach(function(course) {
      document.querySelector('#courses-container').appendChild(course);
    });
  });

  
  // Search courses by title
  // Select the element with the ID "m_search-input" and add an event listener for when its value changes
document.querySelector('#m_search-input').addEventListener('input', function(event) {
    // When the event fires, convert the search query to lowercase and store it in a variable called searchQuery
    const searchQuery = event.target.value.toLowerCase();
    // Select all elements with the class "m_course" and store them in a variable called courses
    const courses = document.querySelectorAll('.m_course');
    // Loop through each course element
    courses.forEach(function(course) {
      // For each course element, select the h2 element and convert its text content to lowercase.
      // Check if the course title includes the search query.
      // If it does, display the course element by setting its display style to "block".
      // Otherwise, hide the course element by setting its display style to "none".
      const courseTitle = course.querySelector('h2').textContent.toLowerCase();
      if (courseTitle.includes(searchQuery)) {
        course.style.display = 'block';
      } else {
        course.style.display = 'none';
      }
    });
  });

  