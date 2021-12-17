- hosts: all
  remote_user: ec2-user
  become: yes
  tasks:
   - name: Install the latest version of Apache
     yum:
       name: httpd
       state: latest        
   - name: Start service httpd, if not started
     ansible.builtin.service:
       name: httpd
       state: started
  install httpd
