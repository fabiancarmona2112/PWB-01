class article {
  /* constructor(_header, _shortDesc, _body, _images){
        this.header = _header;
        this.shortDesc = _shortDesc;
        this.body = _body;
        this.images = _images;
        setId();
    } */

  constructor(_article) {
    this.header = _article[0];
    this.shortDesc = _article[1];
    this.body = _article[2];
    this.images = _article[3];
    setId();
  }

  setId() {
    if (this.id == 0) {
      this.id = 1;
    } else {
      this.id++;
    }
  }

  createArticle(){

  }

}

const $header = document.getElementById("article-header");
const $shortDesc = document.getElementById("article-header");
const $body = document.getElementById("article");
const $files = document.getElementById("image-file");
const sendEditor = document.getElementById("send-editor");
const delteImg = document.getElementById("delete-img-one");
const $storedImages = [
  document.getElementById("img-one"),
  document.getElementById("img-two"),
  document.getElementById("img-three"),
];
let $images = [];
let $imageCounter = 0;

console.log($storedImages);

sendEditor.addEventListener("click", (event) => {
  event.preventDefault();
  const metaArticle = [$header.value, $shortDesc.value, $body.value, $images];

  newArticle = new article(metaArticle);
});

$files.addEventListener("change", () => {
  if ($imageCounter < 3) {
    const files = $files.files[0];
    $images[$imageCounter] = URL.createObjectURL(files);
    $storedImages[$imageCounter].src = $images[$imageCounter];
    delteImg.style.display = "inline";
    $imageCounter++;
  } else {
    alert("Images limit reached");
  }
});

delteImg.addEventListener("click",(event)=>{

    event.preventDefault();
    $storedImages[0].src = 0;
    delteImg.style.display= "none";

});

/*
 **Obtener las partes de la noticia del DOM
 **Darle forma a la noticia
 **Enviar la noticia al editor
 **Colocar la noticia con su respectivo estus en el apartado de publicaciones
 */
