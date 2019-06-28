set names utf8;
set foreign_key_checks=0;

drop database if exists blue;
create database if not exists blue;

use blue;

create table user_info(
	id int primary key not null auto_increment comment "ID",
	user_id varchar(16) unique not null comment "ユーザーID",
	password varchar(16) not null comment "パスワード",
	family_name varchar(32) not null comment "姓",
	first_name varchar(32) not null comment "名",
	family_name_kana varchar(32) not null comment "姓かな",
	first_name_kana varchar(32) not null comment "名かな",
	sex tinyint default 0 comment "性別",
	email varchar(32) comment "メールアドレス",
	status tinyint default 0 comment "ステータス",
	logined tinyint not null default 0 comment "ログインフラグ",
	regist_date datetime comment "登録日",
	update_date datetime comment "更新日"
	)
	default charset=utf8
	comment="会員情報テーブル";

insert into user_info values
(1,"guest","guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(2,"guest2","guest2","インターノウス","ゲストユーザー2","いんたーのうす","げすとゆーざー2",0,"guest2@gmail.com",0,0,now(),now()),
(3,"guest3","guest3","インターノウス","ゲストユーザー3","いんたーのうす","げすとゆーざー3",0,"guest3@gmail.com",0,0,now(),now()),
(4,"guest4","guest4","インターノウス","ゲストユーザー4","いんたーのうす","げすとゆーざー4",0,"guest4@gmail.com",0,0,now(),now()),
(5,"guest5","guest5","インターノウス","ゲストユーザー5","いんたーのうす","げすとゆーざー5",0,"guest5@gmail.com",0,0,now(),now()),
(6,"guest6","guest6","インターノウス","ゲストユーザー6","いんたーのうす","げすとゆーざー6",0,"guest6@gmail.com",0,0,now(),now()),
(7,"guest7","guest7","インターノウス","ゲストユーザー7","いんたーのうす","げすとゆーざー7",0,"guest7@gmail.com",0,0,now(),now()),
(8,"guest8","guest8","インターノウス","ゲストユーザー8","いんたーのうす","げすとゆーざー8",0,"guest8@gmail.com",0,0,now(),now()),
(9,"guest9","guest9","インターノウス","ゲストユーザー9","いんたーのうす","げすとゆーざー9",0,"guest9@gmail.com",0,0,now(),now()),
(10,"guest10","guest10","インターノウス","ゲストユーザー10","いんたーのうす","げすとゆーざー10",0,"guest10@gmail.com",0,0,now(),now()),
(11,"guest11","guest11","インターノウス","ゲストユーザー11","いんたーのうす","げすとゆーざー11",0,"guest11@gmail.com",0,0,now(),now()),
(12,"guest12","guest12","インターノウス","ゲストユーザー12","いんたーのうす","げすとゆーざー12",0,"guest12@gmail.com",0,0,now(),now());

create table product_info(
	id int primary key not null auto_increment comment "ID",
	product_id int not null unique comment "商品ID",
	product_name varchar(100) not null unique comment "商品名",
	product_name_kana varchar(100) not null unique comment "商品名かな",
	product_description varchar(255) comment "商品詳細",
	category_id int not null comment "カテゴリID",
	price int not null comment "価格",
	image_file_path varchar(100) not null comment "画像ファイルパス",
	image_file_name varchar(50) not null comment "画像ファイル名",
	release_date datetime comment "発売年月",
	release_company varchar(50) comment "発売会社",
	status tinyint default 1 comment "ステータス",
	regist_date datetime comment "登録日",
	update_date datetime comment "更新日",
	foreign key(category_id) references m_category(category_id)
	)
	default charset=utf8
	comment="商品情報テーブル";

insert into product_info values
(1,1,"普通の本","ふつうのほん","なんとなく浅く広い知識を身に付けたい時に読む本。この間、道で拾った。持ち主は不明。",2,1000,"./images/book","book1.png",now(),"不明",1,now(),now()),
(2,2,"回復魔法の書","かいふくまほうのしょ","これを買ったあなたは選ばれし回復系の魔法使いです。この本で仲間たちをピンチから救おう！",2,1000,"./images/book","book2.jpg",now(),"回復魔法研究結社",1,now(),now()),
(3,3,"攻撃魔法の書","こうげきまほうのしょ","これを買ったあなたは選ばれし攻撃系の魔法使いです。レベルを積むほど攻撃力が高くなります。",2,100000,"./images/book","book3.jpg",now(),"攻撃魔法研究結社",1,now(),now()),
(4,4,"蘇生魔法の書","そせいまほうのしょ","これを買ったあなたは選ばれし黒魔法使いです。蘇生の魔法で蘇らせまくろう。",2,1000000,"./images/book","book4.jpg",now(),"蘇生魔法研究結社",1,now(),now()),
(5,5,"勇者冒険の書","ゆうしゃぼうけんのしょ","選ばれし勇者あなたは、この本でいつでも冒険をセーブできます。絶対になくさないでください！",2,20000000,"./images/book","book5.jpg",now(),"勇者研究結社",1,now(),now()),
(6,6,"アイロン","あいろん","赤みがかった紫のラインが特徴のアイロン。スチーム機能はもちろん、自立機能も搭載。",3,8000,"./images/household","kaden1.jpg",now(),"目立ち",1,now(),now()),
(7,7,"カメラ","かめら","ヴィンテージデザインを採用したコンデジ。旅行のお供として、重さ、サイズ、また画質も文句なし。",3,105000,"./images/household","kaden2.jpg",now(),"キヤノソ",1,now(),now()),
(8,8,"テレビ","てれび","年代物のテレビ。画面に映る色はモノクロ、本体の部分を発色の良い赤であしらった一品。",3,70000,"./images/household","kaden3.jpg",now(),"フラット",1,now(),now()),
(9,9,"洗濯機","せんたくき","この春、一人暮らしを始めるならこれ。お一人様用サイズの洗濯機。",3,370000,"./images/household","kaden4.png",now(),"西芝",1,now(),now()),
(10,10,"パソコン","ぱそこん","めちゃくちゃスタイリッシュなパソコン。",3,654000,"./images/household","kaden5.jpg",now(),"四菱",1,now(),now()),
(11,11,"ダーツボード","だーつぼーど","カーボン技術を採用し、表面が超硬質で、性能、耐久性共に向上してます。",4,10371,"./images/toy","toy1.jpg",now(),"blue株式会社",1,now(),now()),
(12,12,"チェス","ちぇす","駒と盤の色合いやデザインにこだわった金属製のセットです。",4,4980,"./images/toy","toy2.jpg",now(),"blue株式会社",1,now(),now()),
(13,13,"ラジコンヘリコプター","らじこんへりこぷたー","モーターの燃費の良さと、ふわふわとしたフライト感が楽しめます。",4,13800,"./images/toy","toy3.jpg",now(),"blue株式会社",1,now(),now()),
(14,14,"クマのぬいぐるみ","くまのぬいぐるみ","本物に近い毛並みになっているクマのぬいぐるみです。",4,3000,"./images/toy","toy4.jpg",now(),"blue株式会社",1,now(),now()),
(15,15,"エクスかリバー","えくすかりばー","内部に芯があり、ガラス繊維で強化されている。簡単に折れません。",4,2980,"./images/toy","toy5.jpg",now(),"blue株式会社",1,now(),now()),
(16,16,"運転免許実技試験1発合格秘伝のCD","うんてんめんきょじつぎしけんいっぱつごうかくひでんのしーでぃ","私はサッカー部だった。ポジションは左サイドベンチ。そんな僕も今では「レギュラー、満タンで。」",5,100,"./images/cd","cd1.png",now(),"株式会社ポッポ",1,now(),now()),
(17,17,"曇天でも晴天な気分になれるCD","どんてんでもせいてんなきぶんになれるしーでぃ","雨？曇り？そんなの関係ないさ。これがあればいつでも晴天気分、のはずだった...彼の心には失恋という大きな穴がぽっかりと開いていた。心の天気までは晴れることはなかったあなたへ。月額制マッチングＣＤ。あなたの好みの相手が見つかる♪",5,900,"./images/cd","cd2.jpg",now(),"株式会社ポッポ",1,now(),now()),
(18,18,"グレーなCD","ぐれーなしーでぃ","飼い猫のポチが拾ってきた。",5,10,"./images/cd","cd3.png",now(),"株式会社ポチ",1,now(),now()),
(19,19,"裏面傷だらけのCD","うらめんきずだらけのしーでぃ","新品です",5,198000,"./images/cd","cd4.png",now(),"株式会社タッキー&ユッキー",1,now(),now()),
(20,20,"100％CD","ひゃくぱーせんとしーでぃ","大切なものを隠したい方必見。100％隠せます。",5,100,"./images/cd","cd5.png",now(),"株式会社タッキー&ユッキー",1,now(),now());

create table cart_info(
	id int primary key not null auto_increment comment "ID",
	user_id varchar(16) not null comment "ユーザーID",
	product_id int not null comment "商品ID",
	product_count int not null comment "個数",
	price int comment "金額",
	regist_date datetime comment "登録日",
	update_date datetime comment "更新日",
	foreign key(product_id) references product_info(product_id)
	)
	default charset=utf8
	comment="カート情報テーブル";

create table purchase_history_info(
	id int primary key not null auto_increment comment "ID",
	user_id varchar(16) not null comment "ユーザーID",
	product_id int not null comment "商品ID",
	product_count int comment "個数",
	price int comment "金額",
	destination_id int not null comment "宛先情報ID",
	regist_date datetime comment "登録日",
	update_date datetime comment "更新日",
	foreign key(user_id) references user_info(user_id),
	foreign key(product_id) references product_info(product_id)
	)
	default charset=utf8
	comment="購入履歴情報テーブル";

create table destination_info(
	id int primary key not null auto_increment comment "ID",
	user_id varchar(16) not null comment "ユーザーID",
	family_name varchar(32) not null comment "姓",
	first_name varchar(32) not null comment "名",
	family_name_kana varchar(32) not null comment "姓かな",
	first_name_kana varchar(32) not null comment "名かな",
	email varchar(32) comment "メールアドレス",
	tel_number varchar(13) comment "電話番号",
	user_address varchar(50) not null comment "住所",
	regist_date datetime comment "登録日",
	update_date datetime comment "更新日",
	foreign key(user_id) references user_info(user_id)
	)
	default charset=utf8
	comment="宛先情報テーブル";

insert into destination_info values
(1,"guest","インターノウス","テストユーザー","いんたーのうす","てすとゆーざー","guest@internous.co.jp","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),now());

create table m_category(
	id int primary key not null auto_increment comment "ID",
	category_id int not null unique comment "カテゴリID",
	category_name varchar(20) not null unique comment "カテゴリ名",
	category_description varchar(100) comment "カテゴリ詳細",
	insert_date datetime not null comment "登録日",
	update_date datetime comment "更新日"
	)
	default charset=utf8
	comment="カテゴリマスタテーブル";

insert into m_category values
	(1,1,"全てのカテゴリー","本、家電・パソコン、おもちゃ･ゲーム、CD全てのカテゴリーが対象となります",now(),now()),
	(2,2,"本","本に関するカテゴリーが対象となります",now(),now()),
	(3,3,"家電・パソコン","家電・パソコンに関するカテゴリーが対象となります",now(),now()),
	(4,4,"おもちゃ・ゲーム","おもちゃ・ゲームに関するカテゴリーが対象となります",now(),now()),
	(5,5,"CD","CDに関するカテゴリーが対象となります",now(),now());