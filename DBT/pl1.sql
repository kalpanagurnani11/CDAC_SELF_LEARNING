/*

-------------HELLO WORLD--------------------------------
drop procedure if exists pro1;
delimiter $
create procedure pro1()

BEGIN

select "hello world";

end $
delimiter ;

----------------------------------ADD 2 Var------------------------------------------------------------
drop procedure if exists pro1;
delimiter $
create procedure pro1()

BEGIN
declare x int;
declare y int default 20;

set x:=10;
select x,y;
select x+y;



end $
delimiter ;


--------------------Dyanamic Value--------------------------


drop procedure if exists pro1;
delimiter $
create procedure pro1( x int)

BEGIN

select x*x;

end $
delimiter ;

--------------------------------------------------------------------
drop procedure if exists pro1;
delimiter $
create procedure pro1( x int)

BEGIN
declare y int;
set y:=x*x;
select y;


end $
delimiter ;


----------------------------------------------------------------------------
drop procedure if exists pro1;
delimiter $
create procedure pro1( x int,out z int)

BEGIN

set z:=x*x;



end $
delimiter ;
--------------------------------------------------------------------------------


drop procedure if exists pro1;
delimiter $
create procedure pro1( x int,out z int)

BEGIN

set z:=x*@a;



end $
delimiter ;

--------------------------------------NESTED IF---------------------------------------------

drop procedure if exists pro1;
delimiter $
create procedure pro1(x int)

BEGIN

if x>=10 THEN
select ">=10";
ELSEif x=10 then
select "=";
ELSE
select "<10";
end if;

-------------------------------------CONCAT LOOP------------------------------------------

drop procedure if exists pro1;
delimiter $
create procedure pro1()

BEGIN

declare x int default 1;
declare a varchar(100) default '';

lbl1:LOOP
set a:=concat(a," " ,x);
set x:=x+1;
	if x>=11 then 
		leave lbl1;
	end if;

end loop;
select a;



end $
delimiter ;
*/

drop procedure if exists pro1;
delimiter $
create procedure pro1(x int )

BEGIN
declare y boolean default 0;
if(select true  from emp where empno=x)
then
select empno,ename,job,sal from emp where empno=x;
ELSE
select "enp not found";

endif;
end $
delimiter ;

