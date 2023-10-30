package com.noTimeGoBack.util;

public class Part1Util {
	
	/**
	 * 第一章标题
	 */
	public static final String CHAP1_TIT_NAME="第一章 旱灾";
	/**
	 * 第二章标题
	 */
	public static final String CHAP2_TIT_NAME="第二章 列车上的小偷";
	
	public static final String CHAP1_IMAGE_PATH=Contant.IMAGE_PATH+"001";
	public static final String CHAP2_IMAGE_PATH=Contant.IMAGE_PATH+"002";
	
	public static String getChapterByNum(int num) {
		String content=null;
		switch (num) {
		case 1:
			content=getChapter1();
			break;
		case 2:
			content=getChapter2();
			break;
		}
		return content;
	}

	/**
	 * 获得第一章内容
	 * @return
	 */
	public static String getChapter1() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP1_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("每个人的一生都不是一帆风顺的，充满着喜怒哀乐、酸甜苦辣、悲欢离合、阴晴圆缺。冯小刚在《童梦奇缘》电影里说过的那句经典台词:“生命是一个存在的过程，可悲的是它不能重来，可喜的是它不需要重来。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("当你怨天尤人说上帝把你安排在一个错误的环境里，是否曾想过还有诸多比你处境更加糟糕的强者？上帝既然会给你关上门，同样也会为你打开窗。本书围绕这一结论讲述了故事《没有岁月可回头》。故事为何叫这个名字呢？这个问题现在说有点过早，需要广大读者用心品读，到时候自然不言而喻。让我们看看故事的究竟吧。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("自1854年鸦片战争起，满清政府开始一步步成为列强统治中国的工具，随着中国的领土、领海、司法、关税和贸易主权开始遭到严重破坏，中国逐渐由一个独立自主的国家沦为半殖民地半封建国家。半个世纪后，孙中山领导了辛亥革命，建立了中华民国。但劳动果实被袁世凯夺取了，中国依然处于半殖民地半封建社会。在这种社会背景下，四万万同胞依然日出而作、日落而息的艰苦奋斗。故事要从山东高密县的一座村庄里讲起。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("烈日炎炎的夏天，农民们在一幕幕方田里星罗棋布，面朝黄土地背朝天的农耕。有位少女约摸二十岁左右，头戴蓑笠帽、身穿衬衫、短裤、脚穿沙滩凉鞋和白色尼龙袜(<a href=\""+CHAP1_IMAGE_PATH+"001.jpg\" target=\"_blank\">图</a>)，在收老玉米。边收边念念有词的哼唱着《在希望的田野上》(1)，手推车里一颗颗金黄色的玉米渐渐堆成小山。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("过了大约一个时辰，手推车里老玉米差不多快装满了，少女便推车朝东南方的田地去。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("东南方的田地里有位男子看上去比那位少女大几岁的样子，也在收老玉米。推车里的玉米数看上去比少女的少一些，可能是因为刚才他与人家闲聊的缘故。少女推车朝男子这边来，离着有十来米左右，男子就开口道：“志华！我的好妹子，想不到这一会功夫你干活还挺快的，真是巾帼不让须眉啊！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("少女道：“我的志雄哥，什么一会功夫，都过去大半天了，你得抓紧收了。咱一会还得去离村好几里的集市把“宝贝”(2)卖掉，要是完不成任务，回去没法跟咱妈交代。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("男子忙手忙脚的继续收，把推车里剩余的位置也填满了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“咱二弟哪去了？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“没看到啊，今早起来就没见志伟。有好几次我见他跟酒鬼们彪在一起，我猜十有八九又去找混混去了”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“要是玩上瘾欠下赌债咱可还不起，咱俩都没告诉咱妈，到时候真的出事就不好交代了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我说他好几次了，他就是屡教不改，这次我得好好说说他。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("这位少女姓崔名志华、那位男子是她大哥，名志雄、他们提到的二弟名志伟。他们三人的父亲早在几年前就去世了，自崔父去世后崔母一直有病在身，家里靠志华和志雄哥妹俩种地卖玉米维持。二弟志伟却不务正业，经常和混混们彪一起酗酒、赌博，好几次欠下赌债。还好数目不多，都是哥妹俩用卖玉米赚来的钱给还清的。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("黄昏时分，志雄、志华哥妹俩推着空空的推车回到家。崔母躺在病床上一直咳嗽，听到了二人的脚步声起了三分精神头。哥妹俩报喜道两车玉米统统都卖光了，把赚来的钱放到了抽屉里。崔母两只胳膊分别搂着两位孩子的脖子，欣慰道：“我的好孩子，要是志伟有你们一半听话，我这个当娘的就省心了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志雄安慰道：“娘，我们俩虽然没受过高等教育，但已经学会自己做生意赚钱了，相信往后几年咱家的光景会愈来愈好！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("崔母听到大儿子这番话，瞬间热泪盈眶。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("半夜三更，志伟总算回来了，脚步踉踉跄跄、满身酒气。崔母在屋里睡着了，志雄给二弟开的门。志雄责骂道：“你这个不争气的就做这营生一个顶俩！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志伟却不以为然：“我这几次只喝酒不赌博，我发誓，以后要是再赌博，这两只手就不要了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志伟后面几次虽然和喽啰们鬼混，但也确认没赌博，没惹出什么大事，只是对家事不闻不问罢了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("哥妹俩说过家里的光景会越发越好，但天有不测风云，从次年起山东地区屡年闹旱灾，原先肥沃的田地现在变成了不毛之地，很多村民被迫迁居。与此同时，崔母的病情愈发加重。原先只是咳嗽几声，现在滴水不进。二弟还是原来的德行，志雄、志华感觉家庭胆子日益加重，不卖玉米改为卖鲶鱼。一大早到村头的塘渠里网鱼，但网到的数量很少，收入远不如以前卖玉米的多，有些天鱼鹰都不下水。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("有天崔母让哥妹俩想办法把志伟也找来，有要紧事要交代。孩子三总算到齐了，崔母语气微弱的说：“你们都是我的好孩子，我的身体我心里有数。志雄，你把这房子卖给隔壁的虾姑(3)，会赚来些钱。志雄，你是老大，好好给二弟、三妹分配那些钱，去松花江(4)那边找你爹的大哥吧，他们家在那里生活很多年了，看了我写的这封信面上会收留你们的。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("崔母把枕头底下的一封信递给了志雄，继续说：“志雄、志华你们都懂事，我不担心。志伟不学无术，路上不要惹是生非。你们哥妹俩好好保护他，不要让娘在天上也不安息。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志伟平日虽不务正业，但听了母亲这番话也落泪了，便答：“孩儿谨遵娘的话！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志雄说：“娘会好起来的，会没事的。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("崔母脸上刚露出一丝微笑，便一命呜呼。三个孩子彻底成了孤儿，痛苦不止。一起抬着母亲的遗体，到离村头的溏渠不远处找了块空地上下葬了。随后把母亲生前住过的房子卖给了虾姑，拿着赚来的钱，根据信上的地址踏上了新征途。");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("三个孩子在去松花江的路上会遇到什么事？请看下回分解。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(1)这首歌是解放后期才发行的，这里为了烘托农民艰苦劳作的精神特意穿插进来，望读者不要介意。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(2)指玉米。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(3)村民都这么称呼她，真实姓名不提。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(4)位于东北地区，黑龙江（阿穆尔河）右岸的最大支流，也是中国内河中仅次于长江、黄河而居第三位的大河。");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第二章内容
	 * @return
	 */
	public static String getChapter2() {

		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP2_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("崔家的毛坯房是三十多年前崔母、崔父二人在县里靠种地攒下来的血汗钱买下来的，起初夫妻两在不远处租赁了一间茅屋，买下那套房后才搬过来的。这套房在崔父在世时每逢雨季期间经常漏雨，崔父生前在村里的人脉不错，帮助过好几位邻居，不贪恋。在志华才几岁时，有次村里举办抽奖活动，牛村长（大家称他“阿牛”）有事，劳驾崔父替他抓阄。崔父第一个阄就替阿牛抓了，自己随后才抓的。或许是崔父积善成德，手上也沾满财运，一抓就是特等奖，一辆老爷车。再看看自己的阄，上面写着“谢谢参与”四个字。崔母和三个孩子见阿牛不在现场，都建议他把阄一换蒙混过关。阿牛本来就是位富二代，继承父业家里已经有好几辆车了，也不差这一辆。但崔父却墨守成规的等阿牛回来把领来的车物归原主，阿牛为表谢意送崔父一盒雪茄。崔父注重养身从不吸烟，连烟斗都没碰过，便婉言谢绝。阿牛再三感谢崔父，觉得他为人耿直值得交往。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("往后几年里，山东地区夏季经常多雨，好几次崔家老宅漏雨都是村长阿牛找人帮忙修理的。崔父临走前步履蹒跚，好几次家里有事也是阿牛帮忙代办，包括崔父去世后，崔母体弱多病需要帮助时。崔母走后，三位孩子踏上了征途，全村人都来为他们送行，送给三位孩子一些盘缠。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("松花江离高密县有好几千里路，要是步行不知猴年马月才能到，好比西天取经，路上不定遇到“魑魅魍魉(1)”。在高密县内还好说，出了县身为孩子人生地不熟很是为难。经商议，三人决定坐火车去。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("虽然坐火车快的多，但三人来到火车站看了站牌瞬间愣住了，遇到两大难题。其一：没有直达松花江的列车，只能先到北平城南站再转车去；其二：就算到了松花江，找姑父的住址也是大难题。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("志华走着走着感觉脚酸，虽然经常种地、卖粮食，但走这么远的路以前还真的很少经历。志华低头看到脚上原先雪白色的尼龙袜现在有些泛黄了，脱掉凉鞋看到袜跟处露出了脚后跟、袜尖处露着大拇指，凉鞋鞋底也开裂了。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("志华是位爱干净的女孩，之前每天回家都洗洗，晾干后第二天继续穿，一直保持着雪白色，现在却洗不回原来的样子。志华又估计颜面，马上要上火车了，穿着破烂的凉鞋，白里泛黄的尼龙袜两头破了露在外面会遭人耻笑。就找个拐角处，脱掉凉鞋和尼龙袜扔掉，换上临走前乡亲送她的黑色一字带鞋和白色棉袜(<a class=\"img_a\" href=\""+CHAP2_IMAGE_PATH+"001.png\" target=\"_blank\">图</a>)，这样看上去倒像位要好的大姑娘。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("三人只能摸着石头过河，志雄再三叮嘱志伟，路上一定要听从他的安排，决不能制造事端。随着一声声呜呜的汽笛声，列车冒着滚滚浓烟，终于徐徐的朝站台驶来。三人抬着沉重的行李上车，各自找了空位就座。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("车厢内人群比较拥挤，志华、志伟坐在一起，志雄单独坐在离他两只有两座的地方。有位中年男子蹭蹭的朝志华座位走来，手里抱着狗汪汪叫。志华生来怕狗，加上听到了犬吠声，坐的更不安稳。志雄看出了端倪，示意志华过来到自己的座位，自己去和二弟坐在一起。志雄在过道里走着，从某座位上伸出一条腿来将其绊了个正着，正巧倒在一位女子身上。那位女子就碰瓷说他非礼她。志雄身后突然出现一位男子，大骂：“反了！光天化日下敢调戏良家妇女！”骂完朝志雄胸口就是一拳，志雄后背朝后倒在那位抱狗男子的身上。那位男子一把推开志雄，往车门方向跑了。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("当局者迷旁观者清，刚才发生的一幕幕被志华看在眼里，但她是女子，又插不上手。志华总感觉有猫腻，事情不会这么巧。突然看到那位抱狗的男子准备下车了，手里拿着大哥的钱包。大喊：“有贼！”");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("志雄摸了摸裤兜才发现钱包不见了，里面装着卖掉崔宅赚来的全部积蓄。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("原来那三人是一伙的，抱狗男子在刚才志华换鞋时已经盯上了他们。做贼做惯了，从志华扔掉的鞋袜来看，他们的处境很潦倒。又见志华换上新鞋新袜，猜想他们身上肯定有一笔钱，要是偷来够花一段时间的，便联手演了刚才那出戏。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("志伟二话不说，立马冲下列车，朝小偷追了过去。志雄见积蓄被偷、二弟也追小偷了。钱倒是次要的，唯恐弟弟有闪失，也跟着追下车。");
				sb.append("</div>");
				sb.append("<div class=\"paragraph_div\">");
					sb.append("车子渐渐的开了，慢慢的驶出站台，志华还在车厢里看守着他们的行李，哥弟两又不知去向。志华以前和大哥做过很多次买卖，到不在话下。但这种局面生平真是头次经历，不知所措，不敢想象接下来等着她的会是啥？只能摸着石头过河。不过有点小小的主意，既然三人起初说好了在北平城南站转车，相信等车到了那在那等着哥弟两就是，志伟的脑子不敢说，但志雄一定也会想到去那里等着妹妹的，这是不二法门。");
				sb.append("</div>");
				sb.append("<div class=\"next_chap_nav_div\">");
					sb.append("哥弟两能否再找到找到妹妹？志华接下来会遇到什么事？请看下回分解。");
				sb.append("</div>");
				sb.append("");
				sb.append("");
				sb.append("");
				sb.append("");
				sb.append("");
				sb.append("");
				
				
				
				
				
				sb.append("一个女人姓张名萌，一个男人姓李名龙。李龙的家庭是个惨不忍堵的家庭，自从张萌和李龙结婚后，张萌的命运被李龙的家庭给改变了，一场爱与恨的故事就此拉开帷幕。");
				sb.append("本故事要先从张萌的母亲乔梅花讲起……");
				sb.append("乔梅花1931年出生于东北松花江，后来搬到山东省高密县的一个小山村里，从小在那里长大。全家五口，排行老三。父亲乔大山、母亲崔孟华、大哥乔天赐、二哥乔少康。大山与孟华原居东北松花江，1931年九一八事变爆发，全家被迫逃亡，来到高密县。");
				sb.append("乔梅花五岁那年（1936年12月），西安事变爆发，乔大山加入抗日游击队去绥远前线支援。37年春，在反“右”运动中被队伍里的奸细（卖国贼）出卖，被俘，惨遭绞刑。全家人得知消息深恶痛疾。");
				sb.append("1937年，抗日战争全面爆发，战争硝烟笼罩中华大地，全国人民陷入水深火热中。");
				sb.append("那年乔梅花才六岁就进了私塾，学校地理位置偏僻，与家之间隔了一座大山。乔梅花每天五点起床，晚上七点才能回家。她在校期间成绩每次都能考进年级前五名，而少康却不务正业，经常逃学。乔天赐为了养家糊口，给妹妹筹学费，读完小学就退学在家耕地，卖粮食挣钱。每当耕田疲惫时，时常哼着《在希望的田野上》来提神。");
				sb.append("1943年夏天，鬼子进村扫荡，全村人逃之夭夭。天赐事先向八路军报了信，正要带着家人逃亡，唯独不见少康，天赐料知少康在赌场赌博，要去通知弟弟，崔孟华告诉儿子来不及了。尽管兄弟之前有许多过解，可天赐却不愿出卖手足之情。鬼子以迅雷不及掩耳的速度来到村口，孟华母女正担心天赐的安全，天赐拉着二哥少康在村头飞速朝母女两跑来，后头洋鬼子正穷追不舍。一群洋鬼子用枪瞄准兄弟两，孟华大喊：“天赐、少康，危险！”母亲说话前天赐早就料到下一秒会发生什么事，一把将弟弟拉到前头，用自己的身躯保护好少康。话音刚落，只听“呯……呯……呯……呯”子弹打穿了天赐，天赐依然不肯倒下，尽力将弟弟推到家人身边。螳螂捕蝉黄雀在后，这时，八路军在洋鬼子们身后开枪，消灭了全部敌人。");
				sb.append("第一章         完");
				sb.append("");
				sb.append("");
				sb.append("");
				sb.append("");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}
}
