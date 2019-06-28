package com.internousdev.blue.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.blue.dto.CartInfoDTO;

public class CartInfoDTOTest {

	//getUserId
	@Test
	public void testGetUserId1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId2(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId3(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId4(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId5(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId6(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId7(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId8(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId9(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId10(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId11(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId12(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="ａｂｃあいう１２３漢字";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	//setUserId
	@Test
	public void testSetUserId1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abcあいう１２３漢字";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="ａｂｃあいう１２３漢字";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	//getProductId Test
	@Test
	public void testGetProductId1() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId2() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=2147483647;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId3() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-2147483647;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId4() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId5() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//setProductId Test
	@Test
	public void testSetProductId1() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testAetProductId2() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=2147483647;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId3() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-2147483647;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId4() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId5() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//getProductCount Test
	@Test
	public void testGetProductCount1() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductCount2() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=2147483647;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductCount3() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-2147483647;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductCount4() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductCount5() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//setProductCount Test
	@Test
	public void testSetProductCount1() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductCount2() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=2147483647;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductCount3() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-2147483647;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductCount4() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductCount5() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//get Price test
	@Test
	public void testGetPrice1() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPrice2() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=9999999;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPrice3() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-9999999;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPrice4() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=10000000;
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"10000000.00\"");
		}
	}

	@Test
	public void testGetPrice5() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=-10000000;
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-10000000.00\"");
		}
	}

	@Test
	public void testSetPrice1() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPrice2() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=9999999;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPrice3() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-9999999;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPrice4() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=10000000;
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"10000000.00\"");
		}
	}

	@Test
	public void testSetPrice5() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=-10000000;
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-10000000.00\"");
		}
	}

	//get ProductName test
	@Test
	public void testGetProductName1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="ａｂｃあいう１２３漢字";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	//set ProductName test
	@Test
	public void testSetProductName1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="ａｂｃあいう１２３漢字";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	//get ImageFilePath test
	@Test
	public void testGetImageFilePath1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abcあいう１２３漢字";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	//set ImageFilePath test
	@Test
	public void testSetImageFilePath1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abcあいう１２３漢字";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	//get ProductNamakana
	@Test
	public void testGetProductNameKana1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKana12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="ａｂｃあいう１２３漢字";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	//set ProductNamakana
	@Test
	public void testSetProductNameKana1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKana12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="ａｂｃあいう１２３漢字";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	//Get ReleaseCompany
	@Test
	public void testGetReleaseCompany1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompany12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="ａｂｃあいう１２３漢字";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	//Set ReleaseCompany
	@Test
	public void testSetReleaseCompany1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompany12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="ａｂｃあいう１２３漢字";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	//getId
	@Test
	public void testgetId1(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testgetId2(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=2147483647;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testgetId3(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=2147483647;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testgetId4() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483647");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}

	@Test
	public void testgetId5() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=Integer.parseInt("-2147483647");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//setId
	@Test
	public void testsetId1(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testsetId2(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=2147483647;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testsetId3(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-2147483647;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testsetId4(){
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483647");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}

	@Test
	public void testsetId5(){
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=Integer.parseInt("-2147483647");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//get Date
	@Test
	public void testGetDate1() {
		CartInfoDTO dto=new CartInfoDTO();
		Date expected=null;
		dto.setDate(expected);
		Date actual=dto.getDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetDate2() throws ParseException{
		CartInfoDTO dto=new CartInfoDTO();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected=sdf.parse("20180420 12:00:00");
		dto.setDate(expected);
		assertEquals(expected,dto.getDate());
	}

	//set Date
	@Test
	public void testSetDate1() {
		CartInfoDTO dto=new CartInfoDTO();
		Date expected=null;
		dto.setDate(expected);
		Date actual=dto.getDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetDate2() throws ParseException{
		CartInfoDTO dto=new CartInfoDTO();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected=sdf.parse("20190619 12:00:00");
		dto.setDate(expected);
		assertEquals(expected,dto.getDate());
	}

	//getGoukei
	@Test
	public void testGetGoukei1() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setGoukei(expected);
		int actual=dto.getGoukei();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetGoukei2() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=2147483647;
		dto.setGoukei(expected);
		int actual=dto.getGoukei();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetGoukei3() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-2147483647;
		dto.setGoukei(expected);
		int actual=dto.getGoukei();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetGoukei4() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setGoukei(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}

	}

	@Test
	public void testGetGoukei5() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setGoukei(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//setGoukei
	@Test
	public void testSetGoukei1() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setGoukei(expected);
		int actual=dto.getGoukei();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetGoukei2() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=2147483647;
		dto.setGoukei(expected);
		int actual=dto.getGoukei();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetGoukei3() {
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-2147483647;
		dto.setGoukei(expected);
		int actual=dto.getGoukei();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetGoukei4() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setGoukei(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetGoukei5() throws Exception{
		CartInfoDTO dto=new CartInfoDTO();
		try{
			int postalMin=Integer.parseInt("-2147483648");
			dto.setGoukei(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//Get ImageFileName
	@Test
	public void testGetImageFileName1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう123";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileName12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="ａｂｃあいう１２３漢字";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	//Set ImageFileName
	@Test
	public void testSetImageFileName1() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="0";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName2() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="2147483647";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName3() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="-2147483647";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName4() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="null";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName5() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName6() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName7() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="  ";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName8() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName9() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="あいう１２３";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName10() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName11() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc123あいう１２３漢字";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileName12() {
		CartInfoDTO dto=new CartInfoDTO();
		String expected="ａｂｃあいう１２３漢字";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}
}
