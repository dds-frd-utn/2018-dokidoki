pages = ['page1', 'page2']

function showElement(id){
  for (page of pages) {
    if (page === id) {
      document.getElementById(page).style.display = "inline"
    } else {
      document.getElementById(page).style.display = "none"
    }
  }
}
