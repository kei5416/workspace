<!DOCTYPE html>
<html lang="ja">
    
    
<head>
    <meta charset="UTF-8">
    <title>4eachblog 掲示板</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    
    
    
     <body>
        
        <?php
         
         mb_internal_encoding("utf8");
         $pdo = new PDO("mysql:dbname=lesson_kei;host=localhost;","root","");
         $stmt = $pdo->query("select * from 4each_keijiban");
         
         
         
         ?>
        
        
        
        
        
        <div><img src="4eachblog_logo.jpg">
                 </div>
                 <div id="list">
        <ul class="menu">
            <li>トップ</li>
            <li>プロフィール</li>
            <li>4eachについて</li>
            <li>登録フォーム</li>
            <li>お問い合わせ</li>
            <li>その他</li>
            
            
                </ul></div>
         
         
         <main>
           <div class="main-container">
         
    <div class="left">
        
    
              
<h1>プログラミングニ役立つ掲示板</h1>

        
      <h3>入力フォーム</h3>
        <form method="post" action="insert.php">
        <div>
                <label>ハンドルネーム</label>
                <br>
                <input type="text" class="text" size="35" name="handlename">
            </div>
            
            
             <div>
                <label>タイトル</label>
                <br>
                <input type="text" class="text" size="35" name="title">
            </div>

            
            
             <div>
                <label>コメント</label>
                <br>
                <textarea cols="35" rows="7" name="comments"></textarea>
            </div>
            
            
            <div>
                <input type="submit" class="submit" value="送信する">
            </div>
        </form>
        
        <?php
        
       
        while ($row = $stmt->fetch()){
        
        echo"<div class='kiji'>";  
        echo" <h4>".$row['title']."</h4>";
        echo"   <div class='contents'>";
        echo $row ['comments'];
        echo"  <div class='handlename'>posted by".$row['handlename']."</div>";     
        echo" </div> ";
        echo" </div> ";
        }
      
      ?></div>
        
        <div class="right">
            
            <h2>人気の記事</h2>
                PHPオススメ本<br>
                PHP MyAdminの使い方<br>
                今人気のエディタTop5<br>
                HTMLの基礎<br>
            
            <h2>オススメリング</h2>
            インターノウス株式会社<br>
            XAMPPのダウンロード<br>
            Eckipseのダウンロード<br>
            Braketsのダウンロード<br>
            
            <h2>カテゴリ</h2>
            HTML<br>
            PHP<br>
            My SQL<br>
            JavaScript<br>
            
        </div>
            
        
       <footer>copyright internous｜4each blog is the one which provides A to Z about programming</footer>
        
        
          
        
             </div>
         </main>
    </body>
</html>