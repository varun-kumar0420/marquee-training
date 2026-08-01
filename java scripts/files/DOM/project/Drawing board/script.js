const board = document.getElementById("drawing-board");
const clearBtn = document.getElementById("clear-board");
const slider = document.getElementById("slider");
const colorPicker = document.getElementById("colorPicker");

let isDrawing = false;
let brushSize = slider.value;
let brushColor = colorPicker.value;

board.addEventListener("mousedown", (e) => {
  isDrawing = true;
  draw(e);
});

board.addEventListener("mousemove", (e) => {
  if (isDrawing) {
    draw(e);
  }
});

document.addEventListener("mouseup", () => {
  isDrawing = false;
});

function draw(e){
  const dot = document.createElement("div");
  dot.classList.add("drawing");
  const rect = board.getBoundingClientRect();

  dot.style.width = brushSize + "px";
  dot.style.height = brushSize + "px";
  dot.style.backgroundColor = brushColor;

  dot.style.left = (e.clientX - rect.left - brushSize / 2) + "px";
  dot.style.top = (e.clientY - rect.top - brushSize / 2) + "px";

  board.appendChild(dot);
}

slider.addEventListener("input", () => {
  brushSize = slider.value;
});

colorPicker.addEventListener("input", () => {
  brushColor = colorPicker.value;
  drawings = document.querySelectorAll(".drawing");
  drawings.forEach((dot) => {
    dot.style.backgroundColor = brushColor;
  });
});
clearBtn.addEventListener("click", () => {
  board.innerHTML = "";
});

darkBtn = document.getElementById('dark-btn');
lightBtn = document.getElementById('light-btn');
bwBtn = document.getElementById('bw-btn');
const themes={
  dark: {
    background: '#121212',
    text:'#ffffff'
  },
  light: {
    background: '#ffffff',
    text: '#000000'
  },
  bw: {
    background:'#333333',
    text:'#f0f0f0'
  }
};
function applyTheme(themeName) {
  document.body.style.backgroundColor = themes[themeName].background;
  document.body.style.color = themes[themeName].text;
}

darkBtn.addEventListener('click', () => applyTheme('dark'));
lightBtn.addEventListener('click', () => applyTheme('light'));
bwBtn.addEventListener('click', () => applyTheme('bw'));

board.addEventListener("mouseenter", () => {
  board.style.borderColor = "blue";
});

board.addEventListener("mouseleave", () => {
  board.style.borderColor = "skyblue";
})

document.addEventListener('keydown',(e)=>{
    
    if(e.key== 'ArrowUp'){ //size will increase when we press arrow up key
        e.preventDefault(); //prevent default behaviour i.e. scrolling of page during arrow up and arrow down
        brushSize += 1;
        document.querySelectorAll('.drawing').forEach((el)=>{
            el.style.width = `${brushSize}px`;
            el.style.height = `${brushSize}px`;
        })
    }else if(e.key == 'ArrowDown'){ //size will decrease when we press arrow down key
        e.preventDefault();
        
        brushSize = Math.max(1, brushSize - 1); //don't go below 1px
        document.querySelectorAll('.drawing').forEach((el)=>{
            el.style.width = `${brushSize}px`;
            console.log(`${brushSize}px`);
            el.style.height = `${brushSize}px`;
        })
    }
})