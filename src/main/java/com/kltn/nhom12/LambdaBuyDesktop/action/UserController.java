package com.kltn.nhom12.LambdaBuyDesktop.action;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.example.kltn.SpringAPILambdaBuy.common.request.profile.UpdateProfileDto;
import com.example.kltn.SpringAPILambdaBuy.common.response.ProfileResponseDto;
import com.example.kltn.SpringAPILambdaBuy.common.response.UserResponseDto;
import com.kltn.nhom12.LambdaBuyDesktop.service.ProfileWebService;
import com.kltn.nhom12.LambdaBuyDesktop.service.UserWebService;

public class UserController {
	private JButton btnSubmit;
	private JTextField jtfId;
	private JTextField jtfUsername;
	private JTextField jtfEmail;
	private JTextField jtfFirstName;
	private JTextField jtfLastName;
	private JTextField jtfPhoneNumber;
	private JTextField jtfAvatar;
	private JTextField jtfAddress;
	
	private JLabel jlbMessage;
	private UserResponseDto user = null;
	private UpdateProfileDto updateProfile = null;
	private ProfileResponseDto returnProfile = null;
	private UserWebService userWebService;
	private ProfileWebService profileWebService;
	
	public UserController(JButton btnSubmit, JTextField jtfId, JTextField jtfUsename, JTextField jtfEmail, JTextField jtfFirstName, JTextField jtfLastName, JTextField jtfPhoneNumber, JTextField jtfAvatar, JTextField jtfAddress, JLabel jlbMessage) {
		this.btnSubmit = btnSubmit;
		this.jtfId = jtfId;
		this.jtfUsername = jtfUsename;
		this.jtfEmail = jtfEmail;
		this.jtfFirstName = jtfFirstName;
		this.jtfLastName = jtfLastName;
		this.jtfPhoneNumber = jtfPhoneNumber;
		this.jtfAvatar = jtfAvatar;
		this.jtfAddress = jtfAddress;
		
		this.jlbMessage = jlbMessage;
		this.userWebService = new UserWebService();
		this.profileWebService = new ProfileWebService();
	}
	
	public void setView(UserResponseDto userResponseDto) {
		try {
			this.user = userResponseDto;
			this.returnProfile = userResponseDto.getProfile();
			
			jtfId.setText(user.getId());
			jtfId.disable();
			jtfUsername.setText(user.getUsername());
			jtfUsername.disable();
			jtfEmail.setText(user.getEmail());
			jtfEmail.disable();
			jtfFirstName.setText(user.getProfile().getFirstName());
			jtfLastName.setText(user.getProfile().getLastName());
			jtfPhoneNumber.setText(user.getProfile().getPhoneNumber());
			jtfAvatar.setText(user.getProfile().getAvatar());
			jtfAddress.setText(user.getProfile().getAddress());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public void setEvent() {
		btnSubmit.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnSubmit.setBackground(new Color(100,221,23));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSubmit.setBackground(new Color(0,200,83));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(jtfUsername.getText().length() == 0 || jtfEmail.getText().length() == 0 || jtfFirstName.getText().length() == 0 || jtfLastName.getText().length() == 0 || jtfPhoneNumber.getText().length() == 0 || jtfAvatar.getText().length() == 0 || jtfAddress.getText().length() == 0) {
					jlbMessage.setText("Vui lòng nhập dữ liệu bắt buộc!");
					btnSubmit.setEnabled(false);
				} else {
//					user.setId(jtfId.getText());
//					user.setUsername(jtfUsername.getText());
//					user.setEmail(jtfEmail.getText());
					
					updateProfile.setId(user.getProfile().getId());
					updateProfile.setFirstName(jtfFirstName.getText());
					updateProfile.setLastName(jtfLastName.getText());
					updateProfile.setPhoneNumber(jtfPhoneNumber.getText());
					updateProfile.setAvatar(jtfAvatar.getText());
					updateProfile.setAddress(jtfAddress.getText());
					ProfileResponseDto profileDto = profileWebService.updateProfile(updateProfile);
					
//					user.setProfileDto(profileDto);
//					userWebService.saveUser(user)
					jlbMessage.setText("Cập nhật dữ liệu thành công!");
				}
			}
		});
	}
}
