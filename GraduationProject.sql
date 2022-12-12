DROP TABLE video
CREATE TABLE video(video_id INT,video_name VARCHAR(255),video_src VARCHAR(255))
INSERT INTO video VALUES 
(1,'杠铃操','/GraduattionProject_war_exploded/static/video/Barbell.mp4'),
(2,'增肌','/GraduattionProject_war_exploded/static/video/EnhanceMuscle.mp4'),
(3,'综合格斗','/GraduattionProject_war_exploded/static/video/Fighting.mp4'),
(4,'爵士舞','/GraduattionProject_war_exploded/static/video/Jazz.mp4'),
(5,'减脂','/GraduattionProject_war_exploded/static/video/LoseFat.mp4'),
(6,'普拉提','/GraduattionProject_war_exploded/static/video/Pilates.mp4'),
(7,'动感单车','/GraduattionProject_war_exploded/static/video/Ride.mp4'),
(8,'塑性','/GraduattionProject_war_exploded/static/video/Shapping.mp4'),
(9,'运动康复','/GraduattionProject_war_exploded/static/video/SportsRehabilitation.mp4'),
(10,'瑜伽','/GraduattionProject_war_exploded/static/video/Yoga.mp4')

DROP TABLE locker
CREATE TABLE locker (memberAccount INT,employee_account INT,locker_number INT ,locker_status INT)
INSERT INTO locker VALUES 
(0,0,1,0),
(0,0,2,0),
(0,0,3,0),
(0,0,4,0),
(0,0,5,0),
(0,0,6,0),
(0,0,7,0),
(0,0,8,0),
(0,0,9,0),
(0,0,10,0),
(0,0,11,0),
(0,0,12,0),
(0,0,13,0),
(0,0,14,0),
(0,0,15,0),
(0,0,16,0),
(0,0,17,0),
(0,0,18,0),
(0,0,19,0),
(0,0,20,0),
(0,0,21,0)

CREATE TABLE privated_class_table (class_id INT , class_name VARCHAR(255), class_time VARCHAR(255), coach VARCHAR(255))
INSERT INTO privated_class_table VALUES 
(1,'增肌','120分钟','陈教练'),
(2,'减脂','120分钟','李教练'),
(3,'综合格斗','120分钟','吴教练'),
(4,'塑形','120分钟','黄教练')
DROP TABLE privated_class_order
CREATE TABLE privated_class_order (class_id INT , class_name VARCHAR(255), class_order_id INT, coach VARCHAR(255), member_account INT, member_name VARCHAR(255) )
INSERT INTO privated_class_order VALUES
(1,'增肌',1,'陈教练',202009867,'张三'),
(2,'减脂',2,'李教练',202009867,'张三'),
(3,'综合格斗',3,'吴教练',202009867,'张三'),
(4,'塑形',4,'黄教练',202100788,'李四'),
(5,'增肌',1,'陈教练',202106725,'Tom'),
(6,'增肌',1,'陈教练',202123664,'Lily'),
(7,'增肌',1,'陈教练',202121345,'Ava'),
(8,'减脂',2,'李教练',202121345,'Ava'),
(9,'综合格斗',3,'吴教练',20212134,'Ava'),
(10,'减脂',2,'李教练',202100788,'李四'),
(11,'塑形',4,'黄教练',202100788,'李四')

